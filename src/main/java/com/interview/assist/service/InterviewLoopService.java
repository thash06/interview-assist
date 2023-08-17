package com.interview.assist.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.interview.assist.model.Applicant;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface InterviewLoopService {


    List<String> createInterviewLoop(Applicant candidate);

    String saveTicker(String tickerJson) throws JsonProcessingException;

}
