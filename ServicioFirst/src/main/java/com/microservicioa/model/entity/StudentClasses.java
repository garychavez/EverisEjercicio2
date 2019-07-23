package com.microservicioa.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

//Create my table
@Entity
@Table(name = "StudentClasses")
public class StudentClasses implements Serializable {

	private static final long serialVersionUID = -3347795431249073152L;
// Atributes
	@Column(name = "StudentClasses_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int StudentClasses_id;
	// composite key
	@ManyToOne
	@JoinColumn(name = "student_id", referencedColumnName = "student_id")
	private Student student_id;

	@ManyToOne
	@JoinColumn(name = "class_id", referencedColumnName = "class_id")
	private Classes class_id;

	@Column(name = "date_from")
	private Date date_from;

	@Column(name = "date_to")
	@NotNull
	private Date date_to;

	
//	Generate Getters and Setters

	public int getStudentClasses_id() {
		return StudentClasses_id;
	}

	public void setStudentClasses_id(int studentClasses_id) {
		StudentClasses_id = studentClasses_id;
	}

	public Student getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Student student_id) {
		this.student_id = student_id;
	}

	public Classes getClass_id() {
		return class_id;
	}

	public void setClass_id(Classes class_id) {
		this.class_id = class_id;
	}

	public Date getDate_from() {
		return date_from;
	}

	public void setDate_from(Date date_from) {
		this.date_from = date_from;
	}

	public Date getDate_to() {
		return date_to;
	}

	public void setDate_to(Date date_to) {
		this.date_to = date_to;
	}
	

	
}
