package com.fivestars.customer.data.repository;

import com.fivestars.customer.data.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
