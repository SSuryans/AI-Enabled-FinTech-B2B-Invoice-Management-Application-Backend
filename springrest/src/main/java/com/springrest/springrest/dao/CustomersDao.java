package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Customers;

public interface CustomersDao extends JpaRepository<Customers, Long>{

}
