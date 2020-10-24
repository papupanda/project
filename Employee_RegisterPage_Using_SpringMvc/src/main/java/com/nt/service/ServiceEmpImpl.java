package com.nt.service;

import java.util.List;

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

	@Override
	public List<Employee> getAll() {
		Iterable<Employee> findAll = repo.findAll();
		return (List<Employee>) findAll;
	}

}
