package com.techlearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techlearning.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}
