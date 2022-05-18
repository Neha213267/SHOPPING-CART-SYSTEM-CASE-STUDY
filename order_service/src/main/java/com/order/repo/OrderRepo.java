package com.order.repo;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.order.entity.OrderEntity;
public interface OrderRepo extends MongoRepository<OrderEntity, Integer> {

}