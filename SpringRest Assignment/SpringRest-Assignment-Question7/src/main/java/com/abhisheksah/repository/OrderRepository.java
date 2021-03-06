package com.abhisheksah.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.abhisheksah.model.Order;


@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

}
