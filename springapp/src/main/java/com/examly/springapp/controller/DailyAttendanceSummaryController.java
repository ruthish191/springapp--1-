package com.examly.springapp.controller;

import com.examly.springapp.model.DailyAttendanceSummary;
import com.examly.springapp.service.DailyAttendanceSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

@RestController
@RequestMapping("/daily-summary")
public class DailyAttendanceSummaryController {
    
    @Autowired
    private DailyAttendanceSummaryService dailyAttendanceSummaryService;
    
    @PostMapping("/create")
    public DailyAttendanceSummary createSummary(@RequestBody DailyAttendanceSummary summary) {
        return dailyAttendanceSummaryService.saveDailyAttendanceSummary(summary);
    }
    
    @GetMapping("/employee/{id}")
    public Page<DailyAttendanceSummary> getSummaryByEmployeeId(
            @PathVariable Long id,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return dailyAttendanceSummaryService.getSummaryByEmployeeId(id, pageable);
    }
    
    @GetMapping("/employee/code/{employeeCode}")
    public Page<DailyAttendanceSummary> getSummaryByEmployeeCodeAndDateRange(
            @PathVariable String employeeCode,
            @RequestParam LocalDate startDate,
            @RequestParam LocalDate endDate,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return dailyAttendanceSummaryService.getSummaryByEmployeeCodeAndDateRange(employeeCode, startDate, endDate, pageable);
    }
}