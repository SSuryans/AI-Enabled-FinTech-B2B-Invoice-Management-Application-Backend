package com.springrest.springrest.services;

import java.util.List;

import javax.management.AttributeNotFoundException;

import com.springrest.springrest.entities.Customers;

public interface CustomersService {
	
	public List<Customers> getCustomers();
	
	public Customers getCustomer(long customersId);
	
	public Customers addCustomers(Customers customers);
	
	public Customers updateCustomers(Customers customers);
	
	public void deleteCustomers (long parseLong);
	
}
