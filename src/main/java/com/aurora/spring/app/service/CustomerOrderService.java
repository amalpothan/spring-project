package com.aurora.spring.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurora.spring.app.dao.CustomerOrderDao;
import com.aurora.spring.app.models.CustomerOrder;

@Service
public class CustomerOrderService {

	
	@Autowired
	private CustomerOrderDao custOrderDao;
	
	public CustomerOrder createOrder(CustomerOrder order) {
		return custOrderDao.save(order);
	}
	
	public CustomerOrder fetchOrder(Long id) {
		Optional<CustomerOrder> custOrderObj = custOrderDao.findById(id);
		if(custOrderObj.isPresent()) {
			return custOrderObj.get();
		}
		return null;
	}
}
