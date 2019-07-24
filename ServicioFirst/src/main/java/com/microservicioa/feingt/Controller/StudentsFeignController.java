package com.microservicioa.feingt.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicioa.feingt.model.Students;
import com.microservicioa.feingt.service.StudentsFeignService;



@RestController
@RequestMapping("/Students")
public class StudentsFeignController {

	@Autowired
	private StudentsFeignService studentsservice;
//	@GetMapping("/Get/{id}")
//	public Optional<Students> get(@Valid@PathVariable("id") Integer id) ;

	
	@GetMapping("/Get")
	public List<Students> findAll(){
		return studentsservice.finAll();
		
		
	}
}
