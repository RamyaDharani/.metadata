package com.example.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.entity.Person;
import com.example.database.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	
	PersonService sobj;
	@PostMapping("/postdetails")
	public Person add(@RequestBody Person sobj1 )
	{
		return sobj.addPerson(sobj1);
	}
	@GetMapping("/getdetails")
	public List <Person> get()
	{
		return sobj.getPerson();
		
	}
	

}
