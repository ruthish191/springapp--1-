package com.examly.springapp.service;

import com.examly.springapp.model.AttendanceRecord;
import com.examly.springapp.repository.AttendanceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AttendanceRecordServiceImpl implements AttendanceRecordService {
    
    @Autowired
    private AttendanceRecordRepository attendanceRecordRepository;
    
    @Override
    public AttendanceRecord saveAttendanceRecord(AttendanceRecord attendanceRecord) {
        return attendanceRecordRepository.save(attendanceRecord);
    }
    
    @Override
    public List<AttendanceRecord> getAllAttendanceRecords() {
        return attendanceRecordRepository.findAll();
    }
}