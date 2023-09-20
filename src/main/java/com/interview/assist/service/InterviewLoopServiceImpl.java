package com.interview.assist.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.interview.assist.exception.InterviewAssistanceException;
import com.interview.assist.model.Applicant;
import com.interview.assist.model.Interviewer;
import com.interview.assist.model.InterviewerSchedule;
import com.interview.assist.repository.FileRepository;
import com.interview.assist.repository.InterviewerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service(value = "interviewLoopService")
@AllArgsConstructor
@Log4j2
public class InterviewLoopServiceImpl implements InterviewLoopService {

    public static final String INTERVIEWER_PROFILE_LOCATION = "src/main/resources/test/";

    private final InterviewerRepository interviewerRepository;

    private final FileRepository fileRepository;

    private final InterviewSchedulingService interviewSchedulingService;

    private final MongoTemplate mongoTemplate;

    private List<Interviewer> interviewers;
    @Override
    public void init() throws InterviewAssistanceException {
        try {
            interviewers = mongoTemplate.findAll(Interviewer.class);
            interviewers.forEach(i->
                    log.info("Mongo Interviewer:{}", i)
            );
            if(CollectionUtils.isEmpty(interviewers)){
                interviewers = loadInterviewers();
                interviewers.forEach(mongoTemplate::insert);
            }

        } catch (Exception e) {
            log.error("Unable to insert data into Mongo: {}", e.getMessage(), e);
            throw new InterviewAssistanceException(e);
        }
    }
    @Override
    public List<String> createInterviewLoop(Applicant candidate) {
        List<String> skills = getCandidateSkills(candidate);
        Map<String, List<Interviewer>> interviewersBySkill = identifyInterviewers(skills);
        log.info("Interviewers By Skill: {}", interviewersBySkill);
        List<Interviewer> interviewers = interviewersBySkill.entrySet().stream().flatMap(stringListEntry -> stringListEntry.getValue().stream()).collect(Collectors.toList());

        for(Interviewer interviewer : interviewers) {
            Map<LocalDate, List<InterviewerSchedule>> interviewSchedule = interviewSchedulingService.findInterviewSchedules(interviewer);
            //findAvailableTime(interviewSchedule);

        }
        return null;
    }

//    private Map<> findAvailableTime(Map<LocalDate, List<InterviewerSchedule>> interviewSchedule) {
//    }

    private Map<String, List<Interviewer>> identifyInterviewers(List<String> skills) {
        List<Interviewer> interviewers = interviewerRepository.findBySkill(skills);
        return interviewers.stream().collect(Collectors.groupingBy(interviewer -> interviewer.getSkills()));
    }

    private List<String> getCandidateSkills(Applicant candidate) {
        Map<String, Object> properties = candidate.getAdditionalProperties();
        String applicantSkills = ((Map<String, Object>)((Map<String, Object>)((Map<String, Object>)properties.get("applicant")).get("resume")).get("json")).get("skills").toString();
        //applicantSkills = ((Map.Entry)((Map)((Map.Entry)((Map)((Map.Entry)((Map)((Map.Entry)((Map)properties).entrySet().toArray()[2]).getValue()).entrySet().toArray()[3]).getValue()).entrySet().toArray()[1]).getValue()).entrySet().toArray()[8]).getValue();
        return Arrays.stream(applicantSkills.split(",")).map(String::trim).collect(Collectors.toList());
    }

    @Override
    public List<Interviewer> loadInterviewers() throws InterviewAssistanceException{
        List<String> interviewerIds = Arrays.asList("001", "002", "003", "004");
        List<Interviewer> interviewers =  interviewerIds.stream().map(interviewerId -> {
            try {
                return fileRepository.readFile(String.format("%s/interviewer-%s.json", INTERVIEWER_PROFILE_LOCATION, interviewerId));
            } catch (Exception e) {
                throw new InterviewAssistanceException(e);
            }
        }).map(interviewerJson -> {
            try {
                return convertJsonToInterviewer(interviewerJson);
            } catch (JsonProcessingException e) {
                throw new InterviewAssistanceException(e);
            }
        }).collect(Collectors.toList());
        return interviewers;
    }

    private Interviewer convertJsonToInterviewer(String interviewerJson) throws JsonProcessingException {
        Interviewer interviewer;
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            interviewer = mapper.readValue(interviewerJson, Interviewer.class);
            log.info(" Interviewer Data : {}", interviewer);

        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw e;
        }
        return interviewer;
    }
}
