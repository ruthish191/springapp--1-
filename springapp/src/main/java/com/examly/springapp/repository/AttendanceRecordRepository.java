package com.examly.springapp.repository;

import com.examly.springapp.model.AttendanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface AttendanceRecordRepository extends JpaRepository<AttendanceRecord, Long> {
    List<AttendanceRecord> findByEmployeeCode(String employeeCode);
    List<AttendanceRecord> findByDate(LocalDate date);
}