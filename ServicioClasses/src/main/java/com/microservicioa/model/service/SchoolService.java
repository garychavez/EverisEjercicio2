package com.microservicioa.model.service;

import java.util.List;
import java.util.Optional;

import com.microservicioa.model.entity.School;


public interface SchoolService {

	//the CRUD methods are created
	School save(School model) throws Exception;
	
	School update(School model ) throws Exception;
	
	void delete(Integer id) throws Exception;
	
	Optional< School> get(Integer id) throws Exception;
	
	List<School> findAll(School model) throws Exception;
}
