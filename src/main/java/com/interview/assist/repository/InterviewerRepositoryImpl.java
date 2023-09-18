package com.interview.assist.repository;

import com.interview.assist.model.Interviewer;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class InterviewerRepositoryImpl implements InterviewerRepository {
    @Override
    public List<Interviewer> findBySkill(List<String> skills) {
        return Collections.emptyList();
    }
}
