package com.fivestars.customer.usecases;

import com.fivestars.customer.data.model.Customer;
import com.fivestars.customer.data.repository.CustomerRepository;
import com.fivestars.customer.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerRegister {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer register(CustomerDto customerDto) {
        Customer customerModel = new Customer(customerDto.getName(),
                customerDto.getEmail(), customerDto.getPhone(), customerDto.getMonthlyIncome());
        return customerRepository.save(customerModel);
    }

    protected boolean validateRealCpf() {
        return false;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findById(String id) {
        return customerRepository.findById(id);
    }

    public void deleteById(String id) {
        customerRepository.deleteById(id);
    }

    public long count() {
        return customerRepository.count();
    }
}
