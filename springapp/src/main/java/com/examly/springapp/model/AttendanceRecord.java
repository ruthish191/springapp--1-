package com.examly.springapp.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class AttendanceRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendanceRecordId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "employeeId")
    private Employee employee;
    
    private String employeeCode;
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private AttendanceLogStatus status;
    
    public AttendanceRecord() {}
    
    public Long getAttendanceRecordId() { return attendanceRecordId; }
    public void setAttendanceRecordId(Long attendanceRecordId) { this.attendanceRecordId = attendanceRecordId; }
    
    public Long getId() { return attendanceRecordId; }
    public void setId(Long id) { this.attendanceRecordId = id; }
    
    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }
    
    public String getEmployeeCode() { return employeeCode; }
    public void setEmployeeCode(String employeeCode) { this.employeeCode = employeeCode; }
    
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    
    public AttendanceLogStatus getStatus() { return status; }
    public void setStatus(AttendanceLogStatus status) { this.status = status; }
}