package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo crepo;
	
	@Override
	public Customer savedata(Customer c) {
		
		return crepo.save(c);
	}

	@Override
	public List<Customer> getAlldata() {
		
		return crepo.findAll();
	}

}
