package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.StudentEntity;
import com.nt.model.StudentReg;
import com.nt.repo.StudentRepo;

@Service
public class IStudentService implements StudentService {
    @Autowired
	private StudentRepo repo;
    
	@Override
	public String savedata(StudentReg sr) {
		StudentEntity entity=new StudentEntity();
		BeanUtils.copyProperties(sr, entity);
		StudentEntity save = repo.save(entity);
		if(save==null) {
			return "Student Registration Failed";
		}
		else {
			return "Student Registration Sucessed";
		}
	}

}
