package com.aurora.spring.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurora.spring.app.models.CustomerOrder;
import com.aurora.spring.app.service.CustomerOrderService;

@RestController
@RequestMapping("/order")
public class CustomerOrderController {

	@Autowired
	private CustomerOrderService custOrderService;

	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerOrder> createOrder(@RequestBody CustomerOrder order) {
		return ResponseEntity.ok(custOrderService.createOrder(order));
	}

	@GetMapping("/{id}")
	public ResponseEntity<CustomerOrder> getOrder(@PathVariable Long id) {
		return ResponseEntity.ok(custOrderService.fetchOrder(id));
	}

}
