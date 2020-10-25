package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Customer;
import com.nt.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cservice;
	
	@PostMapping("/save")
	public Customer savedata(@RequestBody Customer c) {
		Customer savedata = cservice.savedata(c);
		return savedata;
		
	}
	@GetMapping("/get")
	public List<Customer> getAll(){
		List<Customer> alldata = cservice.getAlldata();
		return alldata;
	}
	
	

}
