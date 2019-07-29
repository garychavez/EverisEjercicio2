package com.microservicioa.model.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

//Create my table
@Data
@Entity
@Table(name = "StudentClasses")
public class StudentClasses {

// Atributes
	@Column(name = "StudentClasses_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int StudentClasses_id;
	


	@Column(name = "Student_id")
	private int student_id;

	
//	relacion
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("studentReference")
	@JoinColumn(name = "Classes_id")
	private Classes classesReference;



	
}
