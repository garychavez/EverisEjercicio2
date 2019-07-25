package com.microservicioa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicioa.model.entity.Teachers;


public interface TeachersRepository extends JpaRepository<Teachers, Integer>{

}
