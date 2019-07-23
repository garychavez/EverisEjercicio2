package com.microservicioa.model.service;

import java.util.List;
import java.util.Optional;

import com.microservicioa.model.entity.Classes;

public interface ClassesService {

	//the CRUD methods are created
	Classes save(Classes model) throws Exception;
	
	Classes update(Classes model) throws Exception;
	
	void delete(Integer id) throws Exception;
	
	Optional< Classes> get(Integer id) throws Exception;
	
	List<Classes> findAll(Classes model) throws Exception;
}
