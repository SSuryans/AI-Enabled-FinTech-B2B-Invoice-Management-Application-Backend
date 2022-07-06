package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CustomersDao;
import com.springrest.springrest.entities.Customers;
@Service
public class CustomersServiceImpl implements CustomersService {
	
	@Autowired
	private CustomersDao customersDao;

	
	
	
	public CustomersServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}



	public List<Customers> getCustomers() {
		// TODO Auto-generated method stub

		return customersDao.findAll();
	}



	public Customers getCustomers(long customersId) {
		
		// TODO Auto-generated method stub
		return customersDao.getOne(customersId);
	}



	public Customers addCustomers(Customers customers) {
		// TODO Auto-generated method stub
		customersDao.save(customers);
		return customers;
	}



	public Customers updateCustomers(Customers customers) {
		// TODO Auto-generated method stub
		
		customersDao.save(customers);
		return customers;
	}
	
	public void deleteCustomers(long parseLong) {
		// TODO Auto-generated method stub
		Customers entity=customersDao.getOne(parseLong);
		customersDao.delete(entity);
		
	}



	@Override
	public Customers getCustomer(long courseId) {
		// TODO Auto-generated method stub
		return null;
	}

}
