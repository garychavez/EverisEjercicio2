package com.microservicioa.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

//Create my table
@Data
@Entity
@Table(name = "School")
public class School  {

// Atributes
	// primary key
	@Column(name = "school_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int school_id;

	@Column(name = "school_name")
	@NotBlank
	private String school_name;


	
}
