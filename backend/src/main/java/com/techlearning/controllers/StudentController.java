package com.techlearning.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlearning.models.Student;
import com.techlearning.repositories.StudentRepository;


@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping
	public List<Student> index() {
		return studentRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Student show(@PathVariable Integer id) {
		Optional<Student> obj = studentRepository.findById(id);
		
		return obj.orElse(null); 
	}
	
	/*
	@GetMapping("/{id}")
	public ResponseEntity<Proprietario> buscarUm(@PathVariable Integer id) {
		Optional<Proprietario> objOpt = propDAO.findById(id);
		Proprietario obj = objOpt.orElse(null);
		return ResponseEntity.ok(obj);
	}*/

}
