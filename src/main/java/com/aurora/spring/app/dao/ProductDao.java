package com.aurora.spring.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.aurora.spring.app.models.Product;

public interface ProductDao extends CrudRepository<Product, Long> {

}
