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
@Table(name = "Student")
public class Student implements Serializable {

	private static final long serialVersionUID = -4428352480128499044L;

// Atributes
	// primary key
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

	@Column(name = "middle_name")
	@NotBlank
	private String middle_name;

	@Column(name = "last_name")
	@NotBlank
	private String last_name;

	@Column(name = "others_teacher_details")
	@NotBlank
	private String others_teacher_details;

	
//	Generate Getters and Setters
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

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getOthers_teacher_details() {
		return others_teacher_details;
	}

	public void setOthers_teacher_details(String others_teacher_details) {
		this.others_teacher_details = others_teacher_details;
	}

	
}
