package com.examly.springapp.service;

import com.examly.springapp.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, Employee employee);
    List<Employee> getAllEmployees();
}