package com.abhisheksah.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.abhisheksah.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {

}
