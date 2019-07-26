package com.microservicioa.feingt.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservicioa.feingt.model.Students;

@FeignClient("MicroservicioStudent")
public interface StudentsFeignService{
	
	@GetMapping("/Students/Get")	
public List<Students> findAll();
	
	
	@GetMapping("/Students/Get/{id}")
	public Optional<Students> get(@Valid@PathVariable("id") Integer id) ;

}
