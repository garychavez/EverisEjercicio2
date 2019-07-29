package com.microservicioa.model.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicioa.model.entity.StudentClasses;
import com.microservicioa.model.service.StudentClassesService;

@RestController
@RequestMapping("/StudentClasses")

public class StudentClassesController {

	//our service is instantiated
	
		@Autowired 
		StudentClassesService studentClassesService;
		
		@PostMapping
		public StudentClasses Save(@RequestBody StudentClasses studentClasses) throws Exception{
			return studentClassesService.save(studentClasses);
		}
		
		@PutMapping
		public StudentClasses Update(@RequestBody StudentClasses studentClasses) throws Exception{
			return studentClassesService.update(studentClasses);
		}
		
		@DeleteMapping("/{id}")
		public void Delete(@PathVariable("id") Integer id) throws Exception {
			studentClassesService.delete(id);
		}
		
			@GetMapping("/{id}")
		public Optional<StudentClasses> Get(@PathVariable("id") Integer id) throws Exception {
			return studentClassesService.get(id);
		}
			
		@GetMapping
		public List<StudentClasses > findAll() throws Exception {
			return studentClassesService.findAll(null);
			
		}
	

}
