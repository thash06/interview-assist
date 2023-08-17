package com.interview.assist.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("props")
@Getter
@Setter
public class InterviewAssistantProperties {
}
