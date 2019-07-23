package com.microservicioa.model.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicioa.model.entity.Student;
import com.microservicioa.model.repository.StudentRepository;
import com.microservicioa.model.service.StudentService;

@Service
public class StudentServiceImplement implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	@Transactional
	public Student save(Student model) throws Exception {
		return studentRepository.save(model);
	}

	@Override
	@Transactional
	public Student update(Student model) throws Exception {
		return studentRepository.save(model);
	}

	@Override
	@Transactional
	public void delete(Integer id) throws Exception {
		studentRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Student> get(Integer id) throws Exception {
		return studentRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Student> findAll(Student model) throws Exception {
		return studentRepository.findAll();
	}

}
