package com.microservicioa.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

//Create my table
@Data
@Entity
@Table(name = "Classes")
public class Classes {

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

	@OneToMany(mappedBy = "classesReference", fetch = FetchType.LAZY, orphanRemoval = true)
	@JsonIgnoreProperties("classesReference")
	private List<StudentClasses> studentReference;

	
}
