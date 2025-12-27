package com.examly.springapp.service;

import com.examly.springapp.model.AttendanceRecord;
import java.util.List;

public interface AttendanceRecordService {
    AttendanceRecord saveAttendanceRecord(AttendanceRecord attendanceRecord);
    List<AttendanceRecord> getAllAttendanceRecords();
}