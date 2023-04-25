package com.example.ramya.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RamyaController {

	@GetMapping("/signin/{username}")
	public String Signin(@PathVariable("username") String username)
	{
		return"signin successfull for "+username;
	}
}

