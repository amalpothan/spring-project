package com.aurora.spring.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.aurora.spring.app.models.Payment;

public interface PaymentDao extends CrudRepository<Payment, Long>{

}
