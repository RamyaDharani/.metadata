package com.Education.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Education.Model.UserModel;

@Repository
public interface UserRepository  extends JpaRepository<UserModel, Integer>{
	
	UserModel findByEmail(String email);

}
