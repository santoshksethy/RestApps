package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo-api")
public class BaseController
{
	@GetMapping("/get")
	public ResponseEntity<String> getData()
	{
		return new ResponseEntity<String>("GET method",HttpStatus.OK);
	}
	
	
	@PostMapping("/post")
	public ResponseEntity<String> saveData()
	{
		return new ResponseEntity<String>("POST method",HttpStatus.OK);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<String> updateData()
	{
		return new ResponseEntity<String>("PUT method",HttpStatus.OK);
	}
	
	
	@PatchMapping("/partialUpdate")
	public ResponseEntity<String> partialUpdate()
	{
		return new ResponseEntity<String>("PATCH method",HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteData()
	{
		return new ResponseEntity<String>("DELETE method",HttpStatus.OK);
	}
	

}
