package com.Reveiw1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Reveiw1.Entity.TouristGuide;
import com.Reveiw1.Service.TouristGuideService;

@RestController
public class TouristGuideController {
	
	@Autowired
	TouristGuideService servobj;
	
	@PostMapping("/post")
	public TouristGuide Read(@RequestBody TouristGuide robj)
	{
		return servobj.read(robj);
	}
	
	@GetMapping("/get")
	public List<TouristGuide> getAllTouristGuide()
	{
		List<TouristGuide> listobj=servobj.getAllTouristGuide();
		return listobj;
	}
	
	@PutMapping("/put")
	public TouristGuide Update(@RequestBody TouristGuide uobj)
	{
		return servobj.update(uobj);
	}
	
	@DeleteMapping("/delete/{no}")
	public void Delete(@PathVariable("no") int GuideId)
	{
		 servobj.delete(GuideId);
	}
	
	

}