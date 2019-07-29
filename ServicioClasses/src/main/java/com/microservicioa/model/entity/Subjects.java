package com.microservicioa.model.entity;


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
public class Subjects  {

// Atributes
	// primary key
	@Column(name = "subject_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int subject_id;

	@Column(name = "subject_name")
	@NotBlank
	private String subject_name;

}
