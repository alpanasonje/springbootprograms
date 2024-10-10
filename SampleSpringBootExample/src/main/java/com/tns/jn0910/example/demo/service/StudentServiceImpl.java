package com.tns.jn0910.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.jn0910.example.demo.entity.Student;
import com.tns.jn0910.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repo;

	@Override
	public void addStudent(Student s) {
		repo.save(s);

	}

	@Override
	public Student getStudentByUId(int uid) {
		Optional<Student> s = repo.findById(uid);
		if (s.isPresent())
			return s.get();
		else
			return null;
	}

	@Override
	public List<Student> getAllStudents() {

		return repo.findAll();
	}

	@Override
	public void updateStudent(int uid, Student s) {
		Student existsStudent = getStudentByUId(uid);
		if (existsStudent != null)
			repo.save(s);

	}

	@Override
	public void deleteStudent(int uid) {
		repo.deleteById(uid);

	}

}
