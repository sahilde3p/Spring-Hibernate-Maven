package com.sahil.dao;

import java.util.List;

import com.sahil.entity.Customer;

public interface CustomerDao 
{
	public Customer getCustomerById(int id);
	
	public List<Customer> getCustomers();

}
