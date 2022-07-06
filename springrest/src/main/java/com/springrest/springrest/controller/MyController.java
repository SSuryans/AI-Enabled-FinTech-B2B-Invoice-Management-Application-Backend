package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Customers;
import com.springrest.springrest.services.CustomersService;

@RestController
public class MyController {
	
	@Autowired
	private CustomersService customersservice;
	private Object cutomerservice;
	private Object customerservice;

	//this is the starting home page of the web page
	@GetMapping("/home")
	public String home() {
		
		
		return "Welcome to Customers application";
	}
	
	//get all the Customers
	
	@GetMapping("/Customers")
	public List<Customers> getCustomers()
	{
		
		return this.customersservice.getCustomers();
	}
	
	@GetMapping("/customers/{customersId}")
	public Customers getCustomers(@PathVariable String customersId)
	{
		return this.customersservice.getCustomer(Long.parseLong(customersId));
	}
	
	@PostMapping("/customers")
	public Customers addCustomers(@RequestBody Customers customers)
	{
		return this.customersservice.addCustomers(customers);
	}
	
	@PutMapping("/customers")
	public Customers updateCustomers(@RequestBody Customers customers)
	{
		return this.customersservice.updateCustomers(customers);
	}
	
	@DeleteMapping("/customers/{customersId}")
	public ResponseEntity<HttpStatus> deleteCustomers(@PathVariable String customersId)
	{
		try {
			this.customersservice.deleteCustomers(Long.parseLong(customersId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
