package com.examly.springapp.service;

import com.examly.springapp.model.AttendanceLog;
import java.util.List;

public interface AttendanceLogService {
    AttendanceLog saveAttendanceLog(AttendanceLog attendanceLog);
    AttendanceLog updateAttendanceLog(Long id, AttendanceLog attendanceLog);
    List<AttendanceLog> getAllAttendanceLogs();
}