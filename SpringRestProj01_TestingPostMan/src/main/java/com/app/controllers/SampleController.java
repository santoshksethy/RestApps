package com.app.controllers;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/season-api")
public class SampleController
{
	@GetMapping("/display")
	public ResponseEntity<String> showMessage()
	{
		LocalDate date= LocalDate.now();
		int month= date.getMonthValue();
		String season=null;
		if(month>=3&&month<=6)
		{
			season="summer";
		}
		else if(month>=7&&month<=10)
		{
			season="rainy";
		}
		else
		{
			season="winter";
		}
		
		return new ResponseEntity<String>(season+" season",HttpStatus.OK);
	}

}
