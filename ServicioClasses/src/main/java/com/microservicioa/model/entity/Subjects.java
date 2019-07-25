package com.microservicioa.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

//Create my table
@Entity
@Table(name = "Subjects")
public class Subjects implements Serializable {

	private static final long serialVersionUID = 5377773241105450002L;

// Atributes
	// primary key
	@Column(name = "subject_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int subject_id;

	@Column(name = "subject_name")
	@NotBlank
	private String subject_name;

//	Generate Getters and Setters
	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	

}
