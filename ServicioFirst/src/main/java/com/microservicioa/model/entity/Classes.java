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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//Create my table
@Entity
@Table(name = "Classes")
public class Classes implements Serializable {

	private static final long serialVersionUID = 2246957931235210701L;

// Atributes
	// primary key
	@Column(name = "class_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int class_id;

	// foreign key
	@ManyToOne
	@JoinColumn(name = "subject_id", referencedColumnName = "subject_id")
	private Subjects subject_id;

	// foreign key
	@ManyToOne
	@JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id")
	private Teachers teacher_id;

	@Column(name = "class_code")
	@NotBlank
	private String class_code;

	@Column(name = "class_name")
	@NotBlank
	private String class_name;

	@Column(name = "date_from")
	@NotNull
	private Date date_from;

	@Column(name = "date_to")
	@NotNull
	private Date date_to;

	
//	Generate Getters and Setters
	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public Subjects getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(Subjects subject_id) {
		this.subject_id = subject_id;
	}

	public Teachers getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(Teachers teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getClass_code() {
		return class_code;
	}

	public void setClass_code(String class_code) {
		this.class_code = class_code;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
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
