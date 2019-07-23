package com.microservicioa.model.service;

import java.util.List;
import java.util.Optional;

import com.microservicioa.model.entity.Subjects;

public interface SubjectsService {

	//the CRUD methods are created
	Subjects save(Subjects model) throws Exception;
	
	Subjects update(Subjects model)throws Exception;
	
	void delete(Integer id)throws Exception;
	
	Optional<Subjects > get(Integer id)throws Exception;
	
	List<Subjects> findAll(Subjects model)throws Exception;
}
