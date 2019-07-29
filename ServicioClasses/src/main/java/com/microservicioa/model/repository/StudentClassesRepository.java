package com.microservicioa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicioa.model.entity.StudentClasses;

//the repository is connected to the model through the jpa
public interface StudentClassesRepository extends JpaRepository<StudentClasses, Integer> {

}
