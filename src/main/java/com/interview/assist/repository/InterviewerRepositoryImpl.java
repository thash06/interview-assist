package com.interview.assist.repository;

import com.interview.assist.model.Interviewer;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@AllArgsConstructor
@Log4j2
public class InterviewerRepositoryImpl implements InterviewerRepository {

    private final MongoTemplate mongoTemplate;

    @Override
    public List<Interviewer> findBySkill(List<String> skills) {
        // /applicant/resume/json/skills
        //  /skills
//        for(String skill : skills) {
//            log.info("Skill: {} ", skill);
//            Query query = new Query(Criteria.where("skills").is(skill));
//            List<Interviewer> interviewers = mongoTemplate.find(query, Interviewer.class);
//            log.info("Search result for skill: {}  Interviewers: {} ", skill, interviewers);
//        }
        Query query = new Query(Criteria.where("skills").in(skills));
        List<Interviewer> interviewers = mongoTemplate.find(query, Interviewer.class);

        return interviewers;
    }
}
