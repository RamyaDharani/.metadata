package com.Reveiw1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Reveiw1.Entity.TouristGuide;
import com.Reveiw1.Repository.TouristGuideRepository;


@Service
public class TouristGuideService {
	
	@Autowired
	TouristGuideRepository repobj;
	
	
	public TouristGuide read(@RequestBody TouristGuide robj1)
	{
		return repobj.save(robj1);
	}
	
	public List<TouristGuide> getAllTouristGuide()
	{
		 List<TouristGuide>listobj1=repobj.findAll();
		return listobj1;
	}

	public TouristGuide update(@RequestBody TouristGuide uobj1)
	{
		return repobj.save(uobj1);
	}
	public void  delete(int GuideId)
	{
		 repobj.deleteById(GuideId);
	}
	
	
}