package com.mdm.srvdataaccess.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mdm.srvdataaccess.entities.Customer;
import com.mdm.srvdataaccess.persistence.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;

	@GetMapping(path="/allcustomers")
	public @ResponseBody Iterable<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
}
