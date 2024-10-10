package com.tns.jn0910.example.demo.service;

import java.util.List;

import com.tns.jn0910.example.demo.entity.Student;

public interface StudentService {
	void addStudent(Student s);
	Student getStudentByUId(int uid);
	List<Student> getAllStudents();
	void updateStudent(int uid, Student s);
	void deleteStudent(int uid);
	
}
