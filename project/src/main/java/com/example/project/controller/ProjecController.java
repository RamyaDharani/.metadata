package com.example.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjecController {
	@GetMapping("/pro")
	public String get(@RequestParam String username)
	{
		return "project completed:"+username;
	}
	
	
	
	//two parameters passing method
	
	@GetMapping("/login")
	public String getLogin(@RequestParam String username,@RequestParam String Password)
	{
		if(username.equals("ramya")&&Password.equals("12345"))
		{
			return "Login successfull";
		}
		else
		{
			return "login failed";
		}
	}

}


