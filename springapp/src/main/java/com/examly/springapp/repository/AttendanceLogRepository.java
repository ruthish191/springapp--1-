package com.examly.springapp.repository;

import com.examly.springapp.model.AttendanceLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface AttendanceLogRepository extends JpaRepository<AttendanceLog, Long> {
    List<AttendanceLog> findByEmployeeCode(String employeeCode);
    List<AttendanceLog> findByDate(LocalDate date);
    AttendanceLog findByEmployeeCodeAndDate(String employeeCode, LocalDate date);
}