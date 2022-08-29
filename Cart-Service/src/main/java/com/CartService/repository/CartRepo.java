package com.CartService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CartService.model.CartEntity;

public interface CartRepo extends MongoRepository<CartEntity, Integer>{
	public CartEntity getCartByUserId(int id);
}