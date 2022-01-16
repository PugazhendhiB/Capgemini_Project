package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.capgemini.entity.StudentEntity;
import com.capgemini.repository.StudentRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentTestcases {
	
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private TestEntityManager entityManager;

	@BeforeEach
	void setup() {
		StudentEntity studentEntity = new StudentEntity(44, "puga", 9999, "chennai");
		entityManager.persist(studentEntity);
	}

	@Test
	public void findByStudentId() {
		StudentEntity student = studentRepository.findById(44).get();
		assertEquals(44, student.getId());
	}
	@Test
	public void findByStudentName() {
		StudentEntity student = studentRepository.findById(44).get();
		assertEquals("puga", student.getName());
	}
	@Test
	public void findByStudentRollno() {
		StudentEntity student = studentRepository.findById(44).get();
		assertEquals(9999, student.getRollNo());
	}
	@Test
	public void findByStudentLocation() {
		StudentEntity student = studentRepository.findById(44).get();
		assertEquals("chennai", student.getAddress());
	}

}