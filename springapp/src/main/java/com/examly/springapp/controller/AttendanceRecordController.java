package com.examly.springapp.controller;

import com.examly.springapp.model.AttendanceRecord;
import com.examly.springapp.service.AttendanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/attendance-records")
public class AttendanceRecordController {
    
    @Autowired
    private AttendanceRecordService attendanceRecordService;
    
    @PostMapping
    public AttendanceRecord addAttendanceRecord(@RequestBody AttendanceRecord attendanceRecord) {
        return attendanceRecordService.saveAttendanceRecord(attendanceRecord);
    }
    
    @GetMapping
    public List<AttendanceRecord> getAllAttendanceRecords() {
        return attendanceRecordService.getAllAttendanceRecords();
    }
}