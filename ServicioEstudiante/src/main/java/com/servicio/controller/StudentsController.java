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
@RequestMapping("/Students")
public class StudentsController {
	
	
//our service is instantiated
	@Autowired
	StudentsService studentsService;

	
//Annotations are used for CRUD methods
	
	@PostMapping
	public Students save(@Valid@RequestBody Students students) throws Exception {
		return studentsService.save(students);
	}

	
	@PutMapping
	public Students update(@Valid@RequestBody Students students) throws Exception {
		return studentsService.update(students);
	}

	
	@DeleteMapping("/{id}")
	public void delete(@Valid@PathVariable("id") Integer id) throws Exception {
		studentsService.delete(id);
	}

	
	@GetMapping("/{id}")
	public Optional<Students> get(@Valid@PathVariable("id") Integer id) throws Exception {			
		
//				force error
//		boolean ok= false;
//		if(ok== false) {
//			throw new Exception("error al cargar el estudiante");
//		}
//			
//		 try {
//				Thread.sleep(2000L);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		return studentsService.get(id);
	}

	
	@GetMapping
	public List<Students> findAll() throws Exception {
		return studentsService.findAll(null);

	}
}
