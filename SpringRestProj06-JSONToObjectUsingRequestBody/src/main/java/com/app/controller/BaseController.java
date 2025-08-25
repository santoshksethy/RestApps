package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Customer;

@RestController
@RequestMapping("/customer-api")
public class BaseController
{
	@PostMapping("/get")
	public ResponseEntity<String> getData(@RequestBody Customer cust)
	{
		//Customer cust= new Customer(101,"raja",2300.00);
		return new ResponseEntity<String>(cust.toString(),HttpStatus.OK);
	}
	

}
