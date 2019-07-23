package com.everis.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.everis.model.Students;
@FeignClient("servicio-estudiante")
public interface StudentsFeignService{
	
	@GetMapping("/Get")	
public List<Students> finAll();
//public MSStudents finById(Integer id, Date date);

}
