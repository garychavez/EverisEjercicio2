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

import com.microservicioa.model.entity.Student;
import com.microservicioa.model.service.StudentService;

@RestController
@RequestMapping("/Student")

public class StudentController {

	//our service is instantiated
	
		@Autowired
		StudentService studentService;
		
		@PostMapping("/Save")
		public Student Save(@RequestBody Student student) throws Exception{
			return studentService.save(student);
		}
		
		@PutMapping("/Update")
		public Student Update(@RequestBody Student student ) throws Exception{
			return studentService.update(student);
		}
		
		@DeleteMapping("/Delete/{id}")
		public void Delete(@PathVariable("id") Integer id) throws Exception {
			studentService.delete(id);
		}
		
		@GetMapping("/Get/{id}")
		public Optional< Student> Get(@PathVariable("id") Integer id) throws Exception {
			return studentService.get(id);
		}
		
		@GetMapping("/Get")
		public List<Student > findAll() throws Exception {
			return studentService.findAll(null);
			
		}
}
