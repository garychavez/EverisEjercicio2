package com.microservicioa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicioa.model.entity.Subjects;

//the repository is connected to the model through the jpa
public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {

}
