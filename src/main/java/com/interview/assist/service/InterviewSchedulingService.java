package com.interview.assist.service;

import com.interview.assist.model.Interviewer;
import com.interview.assist.model.InterviewerSchedule;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface InterviewSchedulingService {

    Map<LocalDate, List<InterviewerSchedule>> findInterviewSchedules(Interviewer interviewer);
}
