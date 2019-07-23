package com.microservicioa.model.service;

import java.util.List;
import java.util.Optional;

import com.microservicioa.model.entity.Student;

public interface StudentService {

	//the CRUD methods are created
	Student save(Student model) throws Exception;
	
	Student update(Student model) throws Exception;
	
	void delete(Integer id) throws Exception;
	
	Optional<Student > get(Integer id) throws Exception;
	
	List<Student> findAll(Student model) throws Exception;
}
