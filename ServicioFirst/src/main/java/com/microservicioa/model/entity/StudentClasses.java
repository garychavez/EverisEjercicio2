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
	


	@Column(name = "student_id")
	private int student_id;

	
//	relacion
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("studentReference")
	@JoinColumn(name = "studentReference")
	private Classes classesReference;


	public int getStudentClasses_id() {
		return StudentClasses_id;
	}


	public void setStudentClasses_id(int studentClasses_id) {
		StudentClasses_id = studentClasses_id;
	}


	public int getStudent_id() {
		return student_id;
	}


	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}


	public Classes getClassesReference() {
		return classesReference;
	}


	public void setClassesReference(Classes classesReference) {
		this.classesReference = classesReference;
	}
	
	
	
	



	
}
