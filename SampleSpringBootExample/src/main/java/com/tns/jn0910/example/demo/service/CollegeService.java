package com.tns.jn0910.example.demo.service;

import java.util.List;

import com.tns.jn0910.example.demo.entity.College;

public interface CollegeService {
	void addCollege(College c);

	List<College> getAllColleges();

	College getCollege(int code);

	void deleteCollege(int code);

	void updateCollege(int code, College c);

}
