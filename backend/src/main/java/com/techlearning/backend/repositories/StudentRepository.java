package com.techlearning.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techlearning.backend.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}
