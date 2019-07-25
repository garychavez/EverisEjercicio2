package com.microservicioa.model.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicioa.model.entity.School;
import com.microservicioa.model.repository.SchoolRepository;
import com.microservicioa.model.service.SchoolService;


@Service
public class SchoolServiceImplement implements SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	
	@Override
	@Transactional
	public School save(School model) throws Exception {
		return schoolRepository.save(model);
	}

	@Override
	@Transactional
	public School update(School model) throws Exception {
		return schoolRepository.save(model);
	}

	@Override
	@Transactional
	public void delete(Integer id) throws Exception {
		schoolRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<School> get(Integer id) throws Exception {
		return schoolRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<School> findAll(School model) throws Exception {
		return schoolRepository.findAll();
	}

}
