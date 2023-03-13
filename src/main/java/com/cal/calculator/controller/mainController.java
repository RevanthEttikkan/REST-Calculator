package com.cal.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cal.calculator.exceptions.InvalidArgException;

@RestController
public class mainController {
	
	
	
	//Addition
	@GetMapping("{no1}/{operation}/{no2}")
	public double calculation (@PathVariable double no1,@PathVariable double no2,@PathVariable String operation ) throws InvalidArgException {
	
		switch(operation) {
		case "add":
			return no1+no2;
		case "sub":
			return no1-no2;
		case "mul":
			return no1*no2;	
		case "div":
			return no1/no2;
		default:
			throw new InvalidArgException("Invalid Operation");
		}
	
	}
	
		
	
	
}
