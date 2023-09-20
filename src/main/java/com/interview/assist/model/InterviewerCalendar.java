package com.interview.assist.model;


import lombok.Builder;

import java.time.LocalDate;

@Builder
public class InterviewerCalendar {

    private final LocalDate startTime;
    private final LocalDate endTime;
}
