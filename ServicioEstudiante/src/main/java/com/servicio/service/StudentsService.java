package com.servicio.service;

import java.util.List;
import java.util.Optional;

import com.servicio.model.Students;


public interface StudentsService {

//the CRUD methods are created	
	
	Students save(Students model) throws Exception;

	Students update(Students model) throws Exception;
	
	void delete(Integer id) throws Exception;

	Optional<Students> get(Integer id) throws Exception;

	List<Students> findAll(Students model)throws Exception ;
}
