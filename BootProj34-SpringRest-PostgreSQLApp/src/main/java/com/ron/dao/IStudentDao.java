package com.ron.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ron.model.Student;

public interface IStudentDao extends JpaRepository<Student, Integer> {

}
