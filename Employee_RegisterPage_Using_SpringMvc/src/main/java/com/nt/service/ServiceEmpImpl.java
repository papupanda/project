package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.EmpRepository;

@Service
public class ServiceEmpImpl implements IserviceEmp {
    @Autowired
	private EmpRepository repo;
	
	@Override
	public Boolean save(Employee e) {
		Employee empsave = repo.save(e);
		return empsave!=null;
	}

}
