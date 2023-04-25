package com.Reveiw1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Reveiw1.Entity.TouristGuide;

@Repository
public interface TouristGuideRepository extends JpaRepository<TouristGuide, Integer> {
	

}
