package com.microservicioa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicioa.model.entity.StudentClasses;

public interface StudentClassesRepository extends JpaRepository<StudentClasses, Integer> {

}
