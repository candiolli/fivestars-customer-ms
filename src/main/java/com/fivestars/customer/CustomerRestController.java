package com.fivestars.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/")
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerRepository.save(customer));
    }

    @GetMapping("/")
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @GetMapping("/count")
    public long count() {
        return customerRepository.count();
    }

    @GetMapping(("/{id}"))
    public Optional<Customer> findById(@PathVariable("id") final String id) {
        return customerRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") final String id) {
        customerRepository.deleteById(id);
    }
}
