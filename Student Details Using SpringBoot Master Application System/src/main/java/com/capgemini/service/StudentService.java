package com.capgemini.service;

import java.util.List;

import com.capgemini.entity.StudentEntity;

public interface StudentService 
{

	StudentEntity addStudent(StudentEntity student);

	List<StudentEntity> getAllStudent();

	StudentEntity getStudentById(Integer id);

}
