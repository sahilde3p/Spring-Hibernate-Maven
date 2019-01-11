package com.sahil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sahil.service.CustomerService;

@Controller
public class CustomerController
{
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/customer")
	public String getCustomer(@RequestParam int id, Model theModel)
	{
		
		theModel.addAttribute("theCustomer",customerService.getCustomerById(id));
		
		
		return "index";
	}
	
	@GetMapping("/customers")
	public String getCustomers(Model theModel)
	{
		
		theModel.addAttribute("theCustomers",customerService.getCustomers());
		
		
		return "index";
	}

}
