package com.examly.springapp.service;

import com.examly.springapp.model.DailyAttendanceSummary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.time.LocalDate;

public interface DailyAttendanceSummaryService {
    DailyAttendanceSummary saveDailyAttendanceSummary(DailyAttendanceSummary summary);
    Page<DailyAttendanceSummary> getSummaryByEmployeeCodeAndDateRange(String employeeCode, LocalDate startDate, LocalDate endDate, Pageable pageable);
    Page<DailyAttendanceSummary> getSummaryByEmployeeId(Long employeeId, Pageable pageable);
}