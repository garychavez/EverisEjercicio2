package com.servicio.model;

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
@Table(name = "Students")


public class Students implements Serializable {
	
	
//The identifier is generated
	private static final long serialVersionUID = 1L;


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

		
//		Generate Getters and Setters		
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getOther_student_details() {
		return other_student_details;
	}

	public void setOther_student_details(String other_student_details) {
		this.other_student_details = other_student_details;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
