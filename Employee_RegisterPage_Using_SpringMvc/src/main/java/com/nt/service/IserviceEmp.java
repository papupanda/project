package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IserviceEmp {
	public Boolean save(Employee e) ;
	public List<Employee> getAll();
	

}
