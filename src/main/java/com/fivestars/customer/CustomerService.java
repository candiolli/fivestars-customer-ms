package com.fivestars.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(String name, String email, Long phone, Double monthlyIncome) {
        return customerRepository.save(new Customer(name, email, phone, monthlyIncome));
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public long count() {
        return customerRepository.count();
    }

    public Optional<Customer> findById(String id) {
        return customerRepository.findById(id);
    }

    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
