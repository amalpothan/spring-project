package com.aurora.spring.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.aurora.spring.app.models.Project;

public interface ProjectDao extends CrudRepository<Project, Long>{

}
