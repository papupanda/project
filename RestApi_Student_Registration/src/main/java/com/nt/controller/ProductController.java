
package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.StudentReg;
import com.nt.service.StudentService;

@RestController
@RequestMapping("/student")
public class ProductController {
	@Autowired
	private StudentService service;
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody StudentReg reg){
		ResponseEntity<String> res=null;
		String savedata = service.savedata(reg);
		res=new ResponseEntity<String>("Saved"+savedata,HttpStatus.OK);
		return res;
	}

}
