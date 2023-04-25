package com.example.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.entity.Employee;
import com.example.database.service.EmployeeService;

@RestController
public  class EmployeeController {
	@Autowired
	EmployeeService servobj ;
	
	@PostMapping("/save")
	public Employee addDetails(@RequestBody Employee postem)
	{
		return servobj.saveInfo(postem);
		
	}
	@GetMapping(value="/fetch")
public List<Employee> getAllEmployee()
	{
		List<Employee>empList=servobj.getAllEmployee();
		return empList;
	}
	
	@PutMapping("/put")
	public Employee Update(@RequestBody Employee putem)
	{
		return servobj.UpdateInfo(putem);
		
	}
	
	

	

}
