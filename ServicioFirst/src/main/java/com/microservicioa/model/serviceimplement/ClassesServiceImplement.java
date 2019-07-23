package com.microservicioa.model.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicioa.model.entity.Classes;
import com.microservicioa.model.repository.ClassesRepository;
import com.microservicioa.model.service.ClassesService;

@Service
public class ClassesServiceImplement implements ClassesService {

	@Autowired
	private ClassesRepository classesRepository;
	
	@Override
	@Transactional
	public Classes save(Classes model) throws Exception {
		return classesRepository.save(model);
	}

	@Override
	@Transactional
	public Classes update(Classes model) throws Exception {
		return classesRepository.save(model);
	}

	@Override
	@Transactional
	public void delete(Integer id) throws Exception {
		classesRepository.deleteById(id);;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional< Classes> get(Integer id) throws Exception {
		return classesRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Classes> findAll(Classes model) throws Exception {
		return classesRepository.findAll();
	}

}
