package com.servicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio.model.Students;


//the repository is connected to the model through the jpa
public interface StudentsRepository extends JpaRepository<Students, Integer>{

}
