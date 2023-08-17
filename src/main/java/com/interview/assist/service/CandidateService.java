package com.interview.assist.service;

import com.interview.assist.model.Applicant;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CandidateService {

    void init();

    boolean saveProfile(MultipartFile file) throws IOException;

    Applicant findByEmail(String email);

}
