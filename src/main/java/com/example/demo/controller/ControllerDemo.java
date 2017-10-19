package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@RestController
public class ControllerDemo {

	@Autowired
	public StudentRepository studentRepository;
	
	@RequestMapping(value="/")
	public String helloWorld()
	{
		return "Hello World";
	}
	@GetMapping(value="/get")
	public List<Student> getAll()
	{
		List<Student> student=this.studentRepository.findAll();
		System.out.println("Prince");
		return student;
	}
	@GetMapping(value="/getNum/{id}")
	public List<Student> getMax(@PathVariable int id)
	{
		List<Student> student=this.studentRepository.numberLessThan(id);
		System.out.println("Prince");
		return student;
	}
	
	@GetMapping(value="/get/{name}")
	public List<Student> getName(@PathVariable String name)
	{
		List<Student> student=this.studentRepository.findByName(name);
		System.out.println("Prince");
		return student;
	}
}
