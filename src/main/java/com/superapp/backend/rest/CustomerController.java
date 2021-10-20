package com.superapp.backend.rest;

import com.superapp.backend.jpa.CustomerRepository;
import com.superapp.backend.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    CustomerRepository repository;

    @Autowired
    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/customer")
    public Customer create(@RequestBody Customer customer) {
        return repository.save(customer);
    }
}
