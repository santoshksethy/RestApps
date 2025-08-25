package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class BaseController
{
	@GetMapping("/get")
	public ResponseEntity<String> get(@RequestParam("cno") Integer no,@RequestParam(required = false,defaultValue = "Raja") String name)
	{
		return new ResponseEntity<String>("Customer id: "+no+"\nCustomer name: "+name,HttpStatus.OK);
	}
	

}
