package com.servicio.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.model.Students;
import com.servicio.repository.StudentsRepository;
import com.servicio.service.StudentsService;


@Service
public class StudentsServiceImplement implements StudentsService {

//the repository is instantiated
	@Autowired
	private StudentsRepository studentsRepository;


//the logic to the CRUD methods is implemented
	// Method save
	@Override
	public Students save(Students model) {
		return studentsRepository.save(model);
	}

	// Method Update
	@Override
	public Students update(Students model) {
		return studentsRepository.save(model);
	}

	// Method Delete
	@Override
	public void delete(Integer id) {
		studentsRepository.deleteById(id);
	}

	// Method Get
	// for Id
	@Override
	public Optional<Students> get(Integer id) {
		return studentsRepository.findById(id);
	}

	// For All
	@Override
	public List<Students> findAll(Students model) {
		return studentsRepository.findAll();
	}

}
