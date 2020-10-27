package com.nt.repo;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.StudentEntity;

public interface StudentRepo extends CrudRepository<StudentEntity, Integer> {

}
