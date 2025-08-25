package com.app.controller;

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
	public String getData(@RequestBody Customer cust)
	{
		return cust.toString();
	}

}
