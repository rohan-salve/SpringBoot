package com.ron.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ron.dao.IStudentDao;
import com.ron.exception.StudentNotFoundException;
import com.ron.model.Student;


@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao dao;
	
	@Override
	public String saveStudent(Student student) {
		
		Student dbStudent = dao.save(student);
		return "Student saved with ID : "+dbStudent.getSid();
	}

	@Override
	public List<Student> findAllStudents() {
		
		return dao.findAll();
	}

	@Override
	public Student findById(Integer id) {
		Student student =  dao.findById(id).orElseThrow(()-> new StudentNotFoundException("Student Record NOT FOUND"));
		return student;
	}

	@Override
	public String updateStudent(Student student) {
		
		Student dbStudent = dao.save(student);
		return "Student record updated with ID : "+dbStudent.getSid();
	}

	@Override
	public String deleteById(Integer id) {
		Student student = dao.findById(id).orElseThrow(()-> new StudentNotFoundException("Student Record NOT FOUND"));
		dao.delete(student);
		return "Deleted Successfully";
	}

}
