package com.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.data.Student;

@RestController
@RequestMapping("/student-api")
public class BaseController
{
	@GetMapping("/get")
	public ResponseEntity<Student> getStudent()
	{
		List<String> list= new ArrayList<>(Arrays.asList("java","python","mysql","git","docker"));
		Student student= new Student(1,"Michael","Carter","carter.michael@gmail.com",200129897l,580,list);
		
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}

}
