package com.microservicioa.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

//Create my table
@Data
@Entity
@Table(name = "Teachers")
public class Teachers{

// Atributes
	// primary key
	@Column(name = "teacher_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int teacher_id;

	// foreign key
	@ManyToOne
	@JoinColumn(name = "school_id", referencedColumnName = "school_id")
	private School school_id;

	@Column(name = "gender")
	@NotBlank
	private String gender;

	@Column(name = "first_name")
	@NotBlank
	private String first_name;

	@Column(name = "middle_name")
	@NotBlank
	private String middle_name;

	@Column(name = "last_name")
	@NotBlank
	private String last_name;

	@Column(name = "others_teacher_details")
	@NotBlank
	private String others_teacher_details;
	

}
