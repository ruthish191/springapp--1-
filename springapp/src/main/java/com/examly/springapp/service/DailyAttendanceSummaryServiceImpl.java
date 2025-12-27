package com.examly.springapp.service;

import com.examly.springapp.model.DailyAttendanceSummary;
import com.examly.springapp.repository.DailyAttendanceSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class DailyAttendanceSummaryServiceImpl implements DailyAttendanceSummaryService {
    
    @Autowired
    private DailyAttendanceSummaryRepository dailyAttendanceSummaryRepository;
    
    @Override
    public DailyAttendanceSummary saveDailyAttendanceSummary(DailyAttendanceSummary summary) {
        return dailyAttendanceSummaryRepository.save(summary);
    }
    
    @Override
    public Page<DailyAttendanceSummary> getSummaryByEmployeeCodeAndDateRange(String employeeCode, LocalDate startDate, LocalDate endDate, Pageable pageable) {
        return dailyAttendanceSummaryRepository.findByEmployeeCodeAndDateBetween(employeeCode, startDate, endDate, pageable);
    }
    
    @Override
    public Page<DailyAttendanceSummary> getSummaryByEmployeeId(Long employeeId, Pageable pageable) {
        return dailyAttendanceSummaryRepository.findByEmployeeCode(employeeId.toString(), pageable);
    }
}