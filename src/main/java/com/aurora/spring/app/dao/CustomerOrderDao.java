package com.aurora.spring.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.aurora.spring.app.models.CustomerOrder;

public interface CustomerOrderDao extends CrudRepository<CustomerOrder, Long> {

}
