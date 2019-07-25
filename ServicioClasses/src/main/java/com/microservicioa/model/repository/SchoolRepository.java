package com.microservicioa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicioa.model.entity.School;



public interface SchoolRepository extends JpaRepository<School, Integer> {

}
