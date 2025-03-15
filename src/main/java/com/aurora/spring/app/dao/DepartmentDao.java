package com.aurora.spring.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.aurora.spring.app.models.Department;

public interface DepartmentDao extends CrudRepository<Department, Long> {

}
