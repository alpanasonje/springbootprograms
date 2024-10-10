package com.tns.jn0910.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.jn0910.example.demo.entity.College;
import com.tns.jn0910.example.demo.repository.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	CollegeRepository repo;

	@Override
	public void addCollege(College c) {

		repo.save(c);
	}

	@Override
	public List<College> getAllColleges() {
		return repo.findAll();

	}

	@Override
	public College getCollege(int code) {

		return repo.findById(code).get();
	}

	@Override
	public void deleteCollege(int code) {
		repo.deleteById(code);

	}

	@Override
	public void updateCollege(int code, College c) {
		if (getCollege(code) != null)
			repo.save(c);

	}

}
