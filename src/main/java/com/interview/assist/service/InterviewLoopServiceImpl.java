package com.interview.assist.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.interview.assist.model.Applicant;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "interviewLoopService")
@Log4j2
public class InterviewLoopServiceImpl implements InterviewLoopService {
    @Override
    public List<String> createInterviewLoop(Applicant candidate) {
        return null;
    }

    @Override
    public String saveTicker(String tickerJson) throws JsonProcessingException {
        return null;
    }
}
