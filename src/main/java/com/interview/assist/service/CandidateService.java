package com.interview.assist.service;

import com.interview.assist.model.Applicant;
import com.interview.assist.model.Interviewer;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CandidateService {

    void init() throws Exception;

    boolean saveProfile(MultipartFile file) throws IOException;

    Applicant findByEmail(String email) throws Exception;

    List<Interviewer> loadInterviewers() throws Exception;

}
