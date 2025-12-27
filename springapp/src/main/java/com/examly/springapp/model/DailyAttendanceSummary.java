package com.examly.springapp.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class DailyAttendanceSummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long summaryId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "employeeId")
    private Employee employee;
    
    private String employeeCode;
    private LocalDate date;
    private String status;
    
    public DailyAttendanceSummary() {}
    
    public Long getSummaryId() { return summaryId; }
    public void setSummaryId(Long summaryId) { this.summaryId = summaryId; }
    
    public Long getId() { return summaryId; }
    public void setId(Long id) { this.summaryId = id; }
    
    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }
    
    public String getEmployeeCode() { return employeeCode; }
    public void setEmployeeCode(String employeeCode) { this.employeeCode = employeeCode; }
    
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}