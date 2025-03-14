package com.aurora.spring.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.aurora.spring.app.models.OrderItem;

public interface OrderItemDao extends CrudRepository<OrderItem, Long> {

}
