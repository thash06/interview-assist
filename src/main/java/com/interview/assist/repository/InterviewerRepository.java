package com.interview.assist.repository;

import com.interview.assist.model.Interviewer;

import java.util.Collections;
import java.util.List;

public interface InterviewerRepository {

    List<Interviewer> findBySkill(List<String> skills);

}
