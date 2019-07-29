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

import com.microservicioa.model.entity.Subjects;
import com.microservicioa.model.service.SubjectsService;

@RestController
@RequestMapping("/Subjects")

public class SubjectsController {

	//our service is instantiated
	
	@Autowired 
	SubjectsService subjectsService;
	
	@PostMapping
	public Subjects Save(@RequestBody Subjects subjects) throws Exception{
		return subjectsService.save(subjects);
	}
	
	@PutMapping
	public Subjects Update(@RequestBody Subjects subjects) throws Exception{
		return subjectsService.update(subjects);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable("id") Integer id) throws Exception {
		subjectsService.delete(id);
	}
	
	@GetMapping("/{id}")
	public Optional<Subjects > Get(@PathVariable("id") Integer id) throws Exception {
		return subjectsService.get(id);
	}
	
	@GetMapping
	public List<Subjects > findAll() throws Exception {
		return subjectsService.findAll(null);
		
	}
}
