package com.interview.assist.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.interview.assist.exception.InterviewAssistanceException;
import com.interview.assist.model.Applicant;
import com.interview.assist.model.Interviewer;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface InterviewLoopService {

    void init() throws InterviewAssistanceException;
    List<String> createInterviewLoop(Applicant candidate);

    List<Interviewer> loadInterviewers() throws InterviewAssistanceException;

}
