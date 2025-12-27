package com.examly.springapp.service;

import com.examly.springapp.model.AttendanceLog;
import com.examly.springapp.repository.AttendanceLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AttendanceLogServiceImpl implements AttendanceLogService {
    
    @Autowired
    private AttendanceLogRepository attendanceLogRepository;
    
    @Override
    public AttendanceLog saveAttendanceLog(AttendanceLog attendanceLog) {
        return attendanceLogRepository.save(attendanceLog);
    }
    
    @Override
    public AttendanceLog updateAttendanceLog(Long id, AttendanceLog attendanceLog) {
        attendanceLog.setId(id);
        return attendanceLogRepository.save(attendanceLog);
    }
    
    @Override
    public List<AttendanceLog> getAllAttendanceLogs() {
        return attendanceLogRepository.findAll();
    }
}