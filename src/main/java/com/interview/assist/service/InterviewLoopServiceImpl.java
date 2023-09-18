package com.interview.assist.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.interview.assist.model.Applicant;
import com.interview.assist.model.Interviewer;
import com.interview.assist.repository.FileRepository;
import com.interview.assist.repository.InterviewerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
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

    private final MongoTemplate mongoTemplate;

    private List<Interviewer> interviewers;
    @Override
    public void init() throws Exception{
        try {
            interviewers = mongoTemplate.findAll(Interviewer.class);
            interviewers.forEach(i->
                    log.info("Mongo Interviewer:{}", i)
            );
            if(CollectionUtils.isEmpty(interviewers)){
                interviewers = loadInterviewers();
                interviewers.stream().forEach(interviewer -> mongoTemplate.insert(interviewer));
            }

        } catch (Exception e) {
            log.error("Unable to insert data into Mongo: {}", e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<String> createInterviewLoop(Applicant candidate) {
        List<String> skills = getCandidateSkills(candidate);
        Map<String, List<Interviewer>> interviewers = identifyInterviewers(skills);
        return null;
    }

    private Map<String, List<Interviewer>> identifyInterviewers(List<String> skills) {
        List<Interviewer> interviewers = interviewerRepository.findBySkill(skills);
        return null;
    }

    private List<String> getCandidateSkills(Applicant candidate) {
        Map<String, Object> properties = candidate.getAdditionalProperties();
        String applicantSkills = ((Map<String, Object>)((Map<String, Object>)((Map<String, Object>)properties.get("applicant")).get("resume")).get("json")).get("skills").toString();
        //applicantSkills = ((Map.Entry)((Map)((Map.Entry)((Map)((Map.Entry)((Map)((Map.Entry)((Map)properties).entrySet().toArray()[2]).getValue()).entrySet().toArray()[3]).getValue()).entrySet().toArray()[1]).getValue()).entrySet().toArray()[8]).getValue();
        return Arrays.asList(applicantSkills.split(","));
    }

    @Override
    public List<Interviewer> loadInterviewers() throws Exception{
        List<String> interviewerIds = Arrays.asList("001", "002", "003", "004");
        List<Interviewer> interviewers =  interviewerIds.stream().map(interviewerId -> {
            try {
                return fileRepository.readFile(String.format("%s/interviewer-%s.json", INTERVIEWER_PROFILE_LOCATION, interviewerId));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).map(interviewerJson -> {
            try {
                return convertJsonToInterviewer(interviewerJson);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
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
