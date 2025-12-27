package com.examly.springapp.repository;

import com.examly.springapp.model.DailyAttendanceSummary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;

@Repository
public interface DailyAttendanceSummaryRepository extends JpaRepository<DailyAttendanceSummary, Long> {
    
    @Query("SELECT d FROM DailyAttendanceSummary d WHERE d.employeeCode = :employeeCode AND d.date BETWEEN :startDate AND :endDate")
    Page<DailyAttendanceSummary> findByEmployeeCodeAndDateBetween(
        @Param("employeeCode") String employeeCode,
        @Param("startDate") LocalDate startDate,
        @Param("endDate") LocalDate endDate,
        Pageable pageable
    );
    
    Page<DailyAttendanceSummary> findByEmployeeCode(String employeeCode, Pageable pageable);
}