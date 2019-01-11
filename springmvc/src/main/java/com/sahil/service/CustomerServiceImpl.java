package com.sahil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sahil.dao.CustomerDao;
import com.sahil.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	
	@Transactional
	public Customer getCustomerById(int id) {
		
		return customerDao.getCustomerById(id);
	}

	@Transactional
	public List<Customer> getCustomers() {
	
		return customerDao.getCustomers();
	}

}
