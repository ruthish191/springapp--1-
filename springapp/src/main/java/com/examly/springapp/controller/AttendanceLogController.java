package com.examly.springapp.controller;

import com.examly.springapp.model.AttendanceLog;
import com.examly.springapp.service.AttendanceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/attendancelogs")
public class AttendanceLogController {
    
    @Autowired
    private AttendanceLogService attendanceLogService;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AttendanceLog addAttendanceLog(@RequestBody AttendanceLog attendanceLog) {
        return attendanceLogService.saveAttendanceLog(attendanceLog);
    }
    
    @PutMapping("/{id}")
    public AttendanceLog updateAttendanceLog(@PathVariable Long id, @RequestBody AttendanceLog attendanceLog) {
        return attendanceLogService.updateAttendanceLog(id, attendanceLog);
    }
    
    @GetMapping
    public List<AttendanceLog> getAllAttendanceLogs() {
        return attendanceLogService.getAllAttendanceLogs();
    }
}