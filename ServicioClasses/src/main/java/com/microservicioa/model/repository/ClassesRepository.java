package com.microservicioa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicioa.model.entity.Classes;

public interface ClassesRepository extends JpaRepository<Classes, Integer> {

}
