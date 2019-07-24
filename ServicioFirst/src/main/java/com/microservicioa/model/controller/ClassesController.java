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

import com.microservicioa.model.entity.Classes;
import com.microservicioa.model.service.ClassesService;
import com.microservicioa.model.serviceimplement.ClassesServiceImplement;

@RestController
@RequestMapping("/Classes")

public class ClassesController {

	//our service is instantiated
	
		@Autowired
		ClassesServiceImplement classesService;
		
		@PostMapping("/Save")
		public Classes Save(@RequestBody Classes classes) throws Exception{
			return classesService.save(classes);
		}
		
		@PutMapping("/Update")
		public Classes Update(@RequestBody Classes classes) throws Exception{
			return classesService.update(classes);
		}
		
		@DeleteMapping("/Delete/{id}")
		public void Delete(@PathVariable("id") Integer id) throws Exception {
			classesService.delete(id);
		}
		
		@GetMapping("/Get/{id}")
		public Optional<Classes > Get(@PathVariable("id") Integer id) throws Exception {
			return classesService.get(id);
		}
		
		@GetMapping("/Get")
		public List<Classes > findAll() throws Exception {
			return classesService.findAll(null);
			
		}
}
