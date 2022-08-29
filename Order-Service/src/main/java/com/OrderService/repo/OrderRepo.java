package com.OrderService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OrderService.entity.OrderEntity;

public interface OrderRepo extends MongoRepository<OrderEntity, Integer> {

}