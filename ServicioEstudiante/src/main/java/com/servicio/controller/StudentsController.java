package com.servicio.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.servicio.model.Students;
import com.servicio.service.StudentsService;

@RestController
@RequestMapping


public class StudentsController {
	
	
//our service is instantiated
	@Autowired
	StudentsService studentsService;

	
//Annotations are used for CRUD methods
	
	@PostMapping("/Save")
	public Students save(@Valid@RequestBody Students students) throws Exception {
		return studentsService.save(students);
	}

	
	@PutMapping("/Update")
	public Students update(@Valid@RequestBody Students students) throws Exception {
		return studentsService.update(students);
	}

	
	@DeleteMapping("/Delete/{id}")
	public void delete(@Valid@PathVariable("id") Integer id) throws Exception {
		studentsService.delete(id);
	}

	
	@GetMapping("/Get/{id}")
	public Optional<Students> get(@Valid@PathVariable("id") Integer id) throws Exception {
		
		
		return studentsService.get(id);
	}

	
	@GetMapping("/Get")
	public List<Students> findAll() throws Exception {
		return studentsService.findAll(null);

	}
}
