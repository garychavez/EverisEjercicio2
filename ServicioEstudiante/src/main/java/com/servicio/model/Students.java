package com.servicio.model;

import java.io.Serializable;

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
@Table(name = "Students")


public class Students implements Serializable {


//Atributes
		//	primary key
		@Column(name = "student_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Id
		private int student_id;

		@Column(name = "gender")
		@NotBlank
		private String gender;
	
		@Column(name = "first_name")
		@NotBlank
		private String first_name;
	
		@Column(name = "last_name")
		@NotBlank
		private String last_name;
	
		@Column(name = "date_of_birth")
		@NotBlank
		private String date_of_birth;
	
		@Column(name = "other_student_details")
		@NotBlank
		private String other_student_details;

		
}
