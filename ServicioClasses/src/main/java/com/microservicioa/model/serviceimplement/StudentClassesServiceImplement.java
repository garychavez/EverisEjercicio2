package com.microservicioa.model.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicioa.model.entity.StudentClasses;
import com.microservicioa.model.repository.StudentClassesRepository;
import com.microservicioa.model.service.StudentClassesService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StudentClassesServiceImplement implements StudentClassesService {

	@Autowired
	private StudentClassesRepository studentClassesRepository;
	

	@Override
//	@Transactional
	public StudentClasses save(StudentClasses model) throws Exception {
		return studentClassesRepository.save(model);
	}

	@Override
//	@Transactional
	public StudentClasses update(StudentClasses model) throws Exception {
		return studentClassesRepository.save(model);
	}

	@Override
//	@Transactional
	public void delete(Integer id) throws Exception {
		studentClassesRepository.deleteById(id);
	}

	@Override
//	@Transactional(readOnly = true)
	public Optional<StudentClasses> get(Integer id) throws Exception {
		return studentClassesRepository.findById(id);
	}

	@Override
//	@Transactional(readOnly = true)
	public List<StudentClasses> findAll(StudentClasses model) throws Exception {
		return studentClassesRepository.findAll();
	}

}
