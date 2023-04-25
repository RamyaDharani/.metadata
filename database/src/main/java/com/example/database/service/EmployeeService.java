package com.example.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.database.Repository.EmployeeRepository;
import com.example.database.entity.Employee;

@Service
public class EmployeeService {
@Autowired
	EmployeeRepository repobj;

public Employee saveInfo(@RequestBody Employee em1)
{
	return repobj.save(em1);
}
public Employee UpdateInfo(@RequestBody Employee em2)
{
	return repobj.save(em2);
}
public void Delete(int empid)
{
	 repobj.deleteById(empid);
}
 public List<Employee> getAllEmployee()
 {
	 List<Employee>employeeList=repobj.findAll();
	 return employeeList;
 }
}

