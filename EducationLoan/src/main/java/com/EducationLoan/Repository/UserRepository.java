package com.EducationLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EducationLoan.Model.User;

@Repository
public interface UserRepository  extends JpaRepository<User,Integer> {
 
	
}
