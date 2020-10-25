package com.nt.service;

import java.util.List;

import com.nt.entity.Customer;

public interface CustomerService {
	
	public Customer savedata(Customer c);
	public List<Customer> getAlldata();

}
