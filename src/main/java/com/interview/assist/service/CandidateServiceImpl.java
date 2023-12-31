package com.interview.assist.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.interview.assist.model.Applicant;
import com.interview.assist.model.Interviewer;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service(value = "candidateService")
@Log4j2
public class CandidateServiceImpl implements CandidateService {
    public static final String CANDIDATE_PROFILE_LOCATION = "src/main/resources/test/";
    private List<Interviewer> interviewers = null;
    @Override
    public void init() throws Exception{
        interviewers = loadInterviewers();
    }

    @Override
    public boolean saveProfile(MultipartFile file) throws IOException {
        return false;
    }

    @Override
    public Applicant findByEmail(String email) throws Exception{
        String applicantJson = readFile(String.format("%s/%s.json", CANDIDATE_PROFILE_LOCATION, "candidateone@yahoo.com"));
        return convertJsonToApplicant(applicantJson);
    }

    private String readFile(String filePath) throws Exception {

        try {
            Path _filePath = Paths.get(filePath).normalize().toAbsolutePath();
            return Files.readString(_filePath);
        } catch (Exception e) {
            throw new Exception("Failed to store file.", e);
        }
    }

    private Applicant convertJsonToApplicant(String applicantJson) throws JsonProcessingException {
        Applicant applicant;
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            applicant = mapper.readValue(applicantJson, Applicant.class);
            log.info(" Applicant Data : {}", applicant);

        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw e;
        }
        return applicant;
    }


    @Override
    public List<Interviewer> loadInterviewers() throws Exception{
        List<String> interviewerIds = Arrays.asList("001", "002", "003", "004");
        List<Interviewer> interviewers =  interviewerIds.stream().map(interviewerId -> {
            try {
                return readFile(String.format("%s/interviewer-%s.json", CANDIDATE_PROFILE_LOCATION, interviewerId));
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
