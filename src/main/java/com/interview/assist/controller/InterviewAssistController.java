package com.interview.assist.controller;


import com.interview.assist.model.Applicant;
import com.interview.assist.service.CandidateService;
import com.interview.assist.service.InterviewLoopService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
@Log4j2
public class InterviewAssistController {

    private final InterviewLoopService interviewLoopService;
    private final CandidateService candidateService;

    @Autowired
    public InterviewAssistController(InterviewLoopService interviewLoopService, CandidateService candidateService) {
        this.interviewLoopService = interviewLoopService;
        this.candidateService = candidateService;
    }
    @RequestMapping(path = "/interview/interview-loop/{email}", method= RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity<String> createInterviewLoop(@RequestBody final String requestBody,
                                                      @PathVariable("email") String emailAddress){
        try{
            Applicant candidate = candidateService.findByEmail(emailAddress);
            interviewLoopService.createInterviewLoop(candidate);
        } catch(Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        finally {
            return ResponseEntity.status(HttpStatus.CREATED).body("SUCCESS:" + emailAddress);
        }
    }
}
