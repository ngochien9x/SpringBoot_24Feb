package com.tma.service;

import com.tma.repository.CustomerRepository;
import com.tma.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll() {
        return customerRepository.getCustomers();
     //   return Collections.emptyList();
    }
}
