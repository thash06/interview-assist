package com.interview.assist.service;

import com.interview.assist.model.Applicant;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service(value = "candidateService")
@Log4j2
public class CandidateServiceImpl implements CandidateService {
    @Override
    public void init() {

    }

    @Override
    public boolean saveProfile(MultipartFile file) throws IOException {
        return false;
    }

    @Override
    public Applicant findByEmail(String email) {
        return null;
    }
}
