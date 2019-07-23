package com.microservicioa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicioa.model.entity.Subjects;

public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {

}
