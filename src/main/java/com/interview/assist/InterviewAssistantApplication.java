package com.interview.assist;

import com.interview.assist.config.InterviewAssistantProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(InterviewAssistantProperties.class)
public class InterviewAssistantApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewAssistantApplication.class, args);
    }



}
