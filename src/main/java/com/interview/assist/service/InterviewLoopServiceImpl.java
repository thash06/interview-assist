package com.interview.assist.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.interview.assist.model.Applicant;
import com.interview.assist.model.Interviewer;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service(value = "interviewLoopService")
@Log4j2
public class InterviewLoopServiceImpl implements InterviewLoopService {
    @Override
    public List<String> createInterviewLoop(Applicant candidate) {
        List<String> skills = getCandidateSkills(candidate);
        Map<String, List<Interviewer>> interviewers = identifyInterviewers(skills);
        return null;
    }

    private Map<String, List<Interviewer>> identifyInterviewers(List<String> skills) {
        return null;
    }

    private List<String> getCandidateSkills(Applicant candidate) {
        Map<String, Object> properties = candidate.getAdditionalProperties();
        String applicantSkills = ((Map<String, Object>)((Map<String, Object>)((Map<String, Object>)properties.get("applicant")).get("resume")).get("json")).get("skills").toString();
        //applicantSkills = ((Map.Entry)((Map)((Map.Entry)((Map)((Map.Entry)((Map)((Map.Entry)((Map)properties).entrySet().toArray()[2]).getValue()).entrySet().toArray()[3]).getValue()).entrySet().toArray()[1]).getValue()).entrySet().toArray()[8]).getValue();
        return Arrays.asList(applicantSkills.split(","));
    }

    @Override
    public String saveTicker(String tickerJson) throws JsonProcessingException {
        return null;
    }
}
