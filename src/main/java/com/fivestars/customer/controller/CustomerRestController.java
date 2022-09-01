package com.fivestars.customer.controller;

import com.fivestars.customer.data.model.Customer;
import com.fivestars.customer.dto.CustomerDto;
import com.fivestars.customer.usecases.CustomerRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {

    @Autowired
    private CustomerRegister customerRegister;

    @PostMapping("/")
    public ResponseEntity<Customer> save(@RequestBody CustomerDto customer) {
        return ResponseEntity.ok(customerRegister.register(customer));
    }

    @GetMapping("/")
    public List<Customer> findAll() {
        return customerRegister.findAll();
    }

//    @GetMapping("/count")
//    public long count() {
//        return customerRegister.count();
//    }

    @GetMapping(("/{id}"))
    public Optional<Customer> findById(@PathVariable("id") final String id) {
        return customerRegister.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") final String id) {
        customerRegister.deleteById(id);
    }
}
