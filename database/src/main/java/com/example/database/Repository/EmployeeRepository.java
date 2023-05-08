package com.example.database.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.database.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	@Modifying
	@Query("delete from Employee s where s.empname=?1")
     public int  deleteEmployeeByEmpname(String empname);
	
	List<Employee>findByEmpnameStartingWith(String prefix);
	List<Employee>findByEmpnameEndingWith(String Suffix);
	List<Employee>findByEmpdept(String empdept);
	
	
	
	
	//positional parameter
			@Query("select s from Employee s where s.empdept=?1 and s.empname=?2" )
			public List<Employee> getEmployeeByEmpdept(String empdept,String empname);
}
	
	
	
	
	
	
	
