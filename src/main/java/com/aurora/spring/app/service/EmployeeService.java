package com.aurora.spring.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurora.spring.app.dao.EmployeeDao;
import com.aurora.spring.app.models.Employee;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeDao.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeDao.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeDao.deleteById(id);
    }
}