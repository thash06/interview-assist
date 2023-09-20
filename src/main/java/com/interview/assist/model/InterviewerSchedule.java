package com.interview.assist.model;

import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public class InterviewerSchedule {

    private final LocalDate date;

    private final String employeeEmail;

    private final List<InterviewerCalendar> freeSchedules;
}
