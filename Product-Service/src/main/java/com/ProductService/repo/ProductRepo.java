package com.ProductService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ProductService.entity.Product;


public interface ProductRepo extends MongoRepository<Product, Integer>{
	
	

}