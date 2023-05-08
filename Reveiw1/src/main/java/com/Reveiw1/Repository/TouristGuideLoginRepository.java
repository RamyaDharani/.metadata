package com.Reveiw1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Reveiw1.Entity.TouristGuideLogin;

@Repository

public interface TouristGuideLoginRepository extends JpaRepository<TouristGuideLogin, Integer> {
	
	TouristGuideLogin findByUsername(String name);
	

}
