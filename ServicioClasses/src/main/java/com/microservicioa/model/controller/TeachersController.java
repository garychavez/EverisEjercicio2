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

import com.microservicioa.model.entity.Teachers;
import com.microservicioa.model.service.TeachersService;


@RestController
@RequestMapping("/Teachers")

public class TeachersController {

	//our service is instantiated
	
		@Autowired
		TeachersService teachersService;
		
		@PostMapping
		public Teachers Save(@RequestBody Teachers teachers) throws Exception{
			return teachersService.save(teachers);
		}
		
		@PutMapping
		public Teachers Update(@RequestBody Teachers teachers ) throws Exception{
			return teachersService.save(teachers);
		}
		
		@DeleteMapping("/{id}")
		public void Delete(@PathVariable("id") Integer id) throws Exception {
			teachersService.delete(id);
		}
		
		@GetMapping("/{id}")
		public Optional<Teachers > Get(@PathVariable("id") Integer id) throws Exception {
			return teachersService.get(id);
			}
		
		@GetMapping
		public List<Teachers > findAll() throws Exception {
			return teachersService.findAll(null);
			
		}
}
