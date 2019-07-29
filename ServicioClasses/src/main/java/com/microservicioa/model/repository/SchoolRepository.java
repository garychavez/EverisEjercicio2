package com.microservicioa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicioa.model.entity.School;

//the repository is connected to the model through the jpa
public interface SchoolRepository extends JpaRepository<School, Integer> {

}
