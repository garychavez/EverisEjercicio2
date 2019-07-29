package com.microservicioa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicioa.model.entity.Classes;

//the repository is connected to the model through the jpa
public interface ClassesRepository extends JpaRepository<Classes, Integer> {

}
