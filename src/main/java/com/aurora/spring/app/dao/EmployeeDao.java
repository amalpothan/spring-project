package com.aurora.spring.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.aurora.spring.app.models.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Long>{

}
