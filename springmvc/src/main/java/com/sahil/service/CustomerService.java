package com.sahil.service;

import java.util.List;

import com.sahil.entity.Customer;

public interface CustomerService
{
	public Customer getCustomerById(int id);
	
	public List<Customer> getCustomers();
}
