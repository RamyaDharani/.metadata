package com.Reveiw1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Reveiw1.Entity.TouristGuide;
import com.Reveiw1.Repository.TouristGuideRepository;

import jakarta.transaction.Transactional;


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
	
	
	public List<TouristGuide> sortdetails(String field) {
		
		return repobj.findAll(Sort.by(field).descending());
	}

	public Page<TouristGuide> Pagedetails(int offset, int pagesize) {

		Pageable paging = PageRequest.of(offset, pagesize);
		Page<TouristGuide> emp=repobj.findAll(paging);
		return emp;
		
	}

	public List<TouristGuide> PagingAndSorting(int offset,int pageSize,String field) 
	{
		Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
			Page<TouristGuide> emp=repobj.findAll(paging);
			return emp.getContent();
	}
	
	public List<TouristGuide> fetchTouristGuideByGuideNamePrefix(String prefix)
	{
		  return repobj.findByGuideNameStartingWith(prefix);
	}
	public List<TouristGuide> fetchTouristGuidesByGuideNameSuffix(String suffix)
	{
		  return repobj.findByGuideNameEndingWith(suffix);
	}
	public List<TouristGuide> getTouristGuideByAvailability(String availability)
	{
		  return repobj.findByAvailability(availability);
		  
	}

	@Transactional
	public int deleteTouristGuideByName(String guideName)
	{
		return repobj.deleteTouristGuideByGuideName(guideName);
		
	}
	@Transactional
	public int updateTouristGuide(String availability,String guideName)
	{
		return repobj.updateTouritGuide(availability, guideName);
	}
	
	
}
