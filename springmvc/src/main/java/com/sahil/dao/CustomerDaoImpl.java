package com.sahil.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sahil.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao
{
	@Autowired
	private SessionFactory sessionFactory;

	public Customer getCustomerById(int id) 
	{
		Session session= sessionFactory.getCurrentSession();
		
		return session.get(Customer.class, id);

	}

	public List<Customer> getCustomers() 
	{
		Session session= sessionFactory.getCurrentSession();
		
		Query q = session.createQuery("from Customer",Customer.class);
		List<Customer> list = q.getResultList();
		System.out.println(list);
		return list;
	}

}
