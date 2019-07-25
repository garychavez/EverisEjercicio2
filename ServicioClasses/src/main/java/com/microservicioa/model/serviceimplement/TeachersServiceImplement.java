package com.microservicioa.model.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicioa.model.entity.Teachers;
import com.microservicioa.model.repository.TeachersRepository;
import com.microservicioa.model.service.TeachersService;

@Service
public class TeachersServiceImplement implements TeachersService{

	@Autowired
	private TeachersRepository teachersRepository;
	
	@Override
	@Transactional
	public Teachers save(Teachers model) throws Exception {
		return teachersRepository.save(model);
	}

	@Override
	@Transactional
	public Teachers upda(Teachers model) throws Exception {
		return teachersRepository.save(model);
	}

	@Override
	@Transactional
	public void delete(Integer id) throws Exception {
		teachersRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Teachers> get(Integer id) throws Exception {
		return teachersRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Teachers> findAll(Teachers model) throws Exception {
		return teachersRepository.findAll();
	}

}
