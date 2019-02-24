package com.tma.controller;

import com.tma.entity.Customer;
import com.tma.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.service.MainService;

import java.util.List;

@RestController
public class MainController {
	
	@Autowired
	private MainService service;

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHome() {
		return service.getService();
	}

	@RequestMapping(value = "/getCustomers", method = RequestMethod.GET)
	public List<Customer> getCustomers() {
		return customerService.getAll();
	}
}
