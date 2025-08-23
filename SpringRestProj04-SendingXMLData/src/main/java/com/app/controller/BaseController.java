package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.data.Student;


@RestController
@RequestMapping("/demo-api")
public class BaseController
{
	@GetMapping("/fetch")
	private ResponseEntity<Student> getStudent()
	{
		Student student = new Student(100,"Roshan","java",95.0);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@PostMapping("/post")
	private ResponseEntity<Student> postStudent()
	{
		Student student = new Student(100,"Roshan","java",95.0);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	//ready for xml configurations
}
