package com.interview.assist;

import com.interview.assist.config.InterviewAssistantProperties;
import com.interview.assist.service.CandidateService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(InterviewAssistantProperties.class)
public class InterviewAssistantApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewAssistantApplication.class, args);
    }


    @Bean
    CommandLineRunner init(CandidateService candidateService) {
        return (args) -> {
            candidateService.init();
        };
    }

}
