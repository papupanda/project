package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Employee;
import com.nt.service.IserviceEmp;

@Controller
public class EmpController {
	@Autowired
	private IserviceEmp empservice;
	//this method return first page
	@GetMapping("/first")
	public String Firstpage(Model model) {
		Employee e=new Employee();
		Employee e1=new Employee();
		Employee e2=new Employee();
		model.addAttribute("emp", e);
		return "hello";
	}
	//this method save data
	@PostMapping("/save")
	public String SaveEmp(Model model,@ModelAttribute("emp") Employee e) {
		Boolean save = empservice.save(e);
		String saveid="Contact Saved"+save;
		model.addAttribute("sucess",saveid);
		return "hello";
	}
	@GetMapping("/get")
	public String getAll(Model model) {
		List<Employee> all = empservice.getAll();
		model.addAttribute("all", all);
		System.out.println(all);
		return "";
	}
	@GetMapping("/first")
	public String Firstpage(Model model) {
		Employee e=new Employee();
		Employee e1=new Employee();
		Employee e2=new Employee();
		model.addAttribute("emp", e);
		return "hello";
	}

}
