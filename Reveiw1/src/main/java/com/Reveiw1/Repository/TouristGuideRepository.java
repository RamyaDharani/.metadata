package com.Reveiw1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Reveiw1.Entity.TouristGuide;

@Repository
public interface TouristGuideRepository extends JpaRepository<TouristGuide, Integer> {
	
	

		
		
		
		@Modifying
		@Query("delete from TouristGuide s where s.guideName=?1")
	    public int deleteTouristGuideByGuideName(String guideName);
		
	@Modifying
	@Query("update TouristGuide s set s.availability=?1 where s.guideName=?2 ")
	 int updateTouritGuide(String availability,String guideName);

	
		List <TouristGuide>findByGuideNameStartingWith(String prefix);
	    List <TouristGuide>findByAvailability(String availability);
	    List <TouristGuide>findByGuideNameEndingWith(String suffix);
	    
	    


}
