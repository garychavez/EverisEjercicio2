package com.microservicioa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicioa.model.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
