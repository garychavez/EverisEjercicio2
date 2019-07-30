package com.microservicioa.feingt.Controller;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicioa.feingt.model.Students;
import com.microservicioa.feingt.service.StudentsFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/Students")
public class StudentsFeignController {

	@Autowired
	private StudentsFeignService studentsFeignService;

	
	@GetMapping
	public List<Students> findAll(){
		return studentsFeignService.findAll();		
	}
	
//	alternative method
	@HystrixCommand(fallbackMethod = "MetodoAlternativo")
	
	@GetMapping("/{id}")
	public Optional<Students> get(@Valid@PathVariable("id") Integer id)  {			
		return studentsFeignService.get(id);
	}
	
	
//	alternative method
	public Optional<Students> MetodoAlternativo(@Valid@PathVariable("id") Integer id)  {			
		Students students= new Students();
		
		students.setStudent_id(id);
		students.setGender("masculino");
		students.setFirst_name("Gary");
		students.setLast_name("Chavez");
		students.setDate_of_birth("19");
		students.setOther_student_details("6° de secundaria");
		return Optional.of(students);
	}
	
}
