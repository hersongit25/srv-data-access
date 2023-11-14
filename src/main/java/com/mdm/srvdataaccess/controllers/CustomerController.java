package com.mdm.srvdataaccess.controllers;

import java.rmi.ServerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping(path="/customerpost",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer custom) throws ServerException {
		Customer customer = customerRepository.save( custom );
		
		if( customer == null ) {
			throw new ServerException("");
		}else {
			return new ResponseEntity(customer, HttpStatus.CREATED);
		}

	}
}
