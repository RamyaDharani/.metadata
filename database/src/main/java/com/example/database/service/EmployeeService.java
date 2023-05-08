package com.example.database.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.database.Repository.EmployeeRepository;

import com.example.database.entity.Employee;

import jakarta.transaction.Transactional;

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

 public void DeleteInfo(int empid)
 {
	repobj.deleteById(empid);
	
}
public List<Employee> sortdetails(String field) {
	
	return repobj.findAll(Sort.by(field));
}

public Page<Employee> Pagedetails(int offset, int pagesize) {

	Pageable paging = PageRequest.of(offset, pagesize);
	Page<Employee> emp=repobj.findAll(paging);
	return emp;
	
}

public List<Employee> PagingAndSorting(int offset,int pageSize,String field) 
{
	Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		Page<Employee> emp=repobj.findAll(paging);
		return emp.getContent();
}

public List<Employee> findByStart(String prefix)

{
	return repobj.findByEmpnameStartingWith(prefix);
}
public List<Employee> findByEnd(String suffix)

{
	return repobj.findByEmpnameEndingWith(suffix);
}
public List<Employee> findByDept(String empdept)

{
	return repobj.findByEmpdept(empdept);
}

public List<Employee> getEmployeeByEmpdept(String empdept,String empname)
{
	  return repobj.getEmployeeByEmpdept(empdept, empname);
}

@Transactional

public int deleteEmployeeByEmpname(String empname)

{
	return repobj.deleteEmployeeByEmpname(empname);
}



}