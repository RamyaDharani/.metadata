package com.example.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.entity.Employee;
import com.example.database.service.EmployeeService;

@RestController
public  class EmployeeController {
	@Autowired
	EmployeeService servobj ;
	
				//CRUD
	//create
	@PostMapping("/save")
	public Employee addDetails(@RequestBody Employee postem)
	{
		return servobj.saveInfo(postem);
		
	}
	//read
	@GetMapping("/fetch")
public List<Employee> getAllEmployee()
	{
		return servobj.getAllEmployee();
		
	}
	//update
	@PutMapping("/put")
	public Employee Update(@RequestBody Employee putem)
	{
		return servobj.UpdateInfo(putem);
		
	}
	//delete
	@DeleteMapping("/delete/{no}")
	public String delete(@PathVariable("no") int empid)
	{
		servobj.DeleteInfo(empid);
		return"Deleted Successfully";
	}
	
	//sorting
	@GetMapping("/get/{field}")
	 public List<Employee> SortDetails(@PathVariable("field") String field)
	 {
		return servobj.sortdetails(field);
	 
	 
	}
	//paging
	@GetMapping("/page/{offset}/{pagesize}")
	 public Page <Employee> PageDetails(@PathVariable("offset") int Offset,@PathVariable("pagesize") int pagesize )
	 {
		return servobj.Pagedetails(Offset,pagesize);
	 
	 
	}
	//paging and sorting
	
	@GetMapping("/paging/{offset}/{pagesize}/{field}")
	 public List<Employee> PageAndSortDetails(@PathVariable("offset") int Offset,@PathVariable("pagesize") int pagesize ,@PathVariable("field") String field )
	 {
		return servobj.PagingAndSorting(Offset,pagesize,field);
	 
	 
	}
	
	@GetMapping("/findBystart/{prefix}")
	public List<Employee> findByPrefix(@PathVariable("prefix") String prefix)
	{
		return servobj.findByStart(prefix);
	}
	
	@GetMapping("/findByend/{suffix}")
	public List<Employee> findBySuffix(@PathVariable("suffix") String suffix)
	{
		return servobj.findByEnd(suffix);
	}
	
	@GetMapping("/findBydepartment/{empdept}")
	public List<Employee> findByDepartment(@PathVariable("empdept") String empdept)
	{
		return servobj.findByDept(empdept);
	}

@GetMapping("/fetchby{empdept}/{empname}")
 public List<Employee> findByDeptAndName(@PathVariable("empdept") String empdept,@PathVariable("empname") String empname)
 {
	return servobj.getEmployeeByEmpdept(empdept, empname);
 }
	
@DeleteMapping("/deleteby/{empname}")
public String deleteEmployeeByName(@PathVariable("empname") String empname)
{
	int result= servobj.deleteEmployeeByEmpname(empname);
	if(result>0)
	{
		return "employee record is deleted";
	}
	else
		return "No record found";
}


}
