package com.Reveiw1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Reveiw1.Entity.TouristGuide;
import com.Reveiw1.Service.TouristGuideService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

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
	public String Delete(@PathVariable("no") int GuideId)
	{
		 servobj.delete(GuideId);
		 return "Deleted Successfully";
	}
	@GetMapping("/sort/{field}")
	public List<TouristGuide> SortDetails(@PathVariable("field") String field)
	 {
		return servobj.sortdetails(field);
	 
	 
	}
	//paging
	@GetMapping("/page/{offset}/{pagesize}")
	 public Page <TouristGuide> PageDetails(@PathVariable("offset") int Offset,@PathVariable("pagesize") int pagesize )
	 {
		return servobj.Pagedetails(Offset,pagesize);
	 
	 
	}
	//paging and sorting
	
	@GetMapping("/paging/{offset}/{pagesize}/{field}")
	 public List<TouristGuide> PageAndSortDetails(@PathVariable("offset") int Offset,@PathVariable("pagesize") int pagesize ,@PathVariable("field") String field )
	 {
		return servobj.PagingAndSorting(Offset,pagesize,field);
	 
	 
	}
	@Operation(summary = "fetch  TouristGuide detail by prefix")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "TouristGuide data fetched successfully"),
	@ApiResponse(responseCode = "401", description = "Invalid credentials"),
	@ApiResponse(responseCode = "404", description = "Path not found") })
	
	
	@GetMapping("/fetchbyprefix")
	public List<TouristGuide>fetchTouristGuideByNamePrefix(@RequestParam String prefix)
	{
		return servobj.fetchTouristGuideByGuideNamePrefix(prefix);
	}
	
	
	@Operation(summary = "fetch  TouristGuide detail by suffix")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "TouristGuide data fetched successfully"),
	@ApiResponse(responseCode = "401", description = "Invalid credentials"),
	@ApiResponse(responseCode = "404", description = "Path not found") })
	
	@GetMapping("/fetchbysuffix")
	public List<TouristGuide>fetchTouristGuideByNameSuffix(@RequestParam String suffix)
	{
		return servobj.fetchTouristGuidesByGuideNameSuffix(suffix);
	}
	
	
	@Operation(summary = "fetch  TouristGuide detail by availability")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "TouristGuide data fetched successfully"),
	@ApiResponse(responseCode = "401", description = "Invalid credentials"),
	@ApiResponse(responseCode = "404", description = "Path not found") })
	
	@GetMapping("/getbyavailability/{availability}")
	public List<TouristGuide>fetchTouristGuideByAvailability(@PathVariable String availability )
	{
		return servobj.getTouristGuideByAvailability(availability);
	}
	
	

	@Operation(summary = "delete  TouristGuide detail")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "TouristGuide data deleted successfully"),
	@ApiResponse(responseCode = "401", description = "Invalid credentials"),
	@ApiResponse(responseCode = "404", description = "Path not found") })
	
	
	@DeleteMapping("/deletebyquery/{guideName}")
	public String deleteTouristGuideByName(@PathVariable("guideName") String guideName)
	{
		int result=servobj.deleteTouristGuideByName(guideName);
		if(result>0)
			return "TouristGuide record deleted";
		else
			return "Problem occured while deleting";
	}
	
	
	@Operation(summary = "update  TouristGuide detail")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "TouristGuide data updated successfully"),
	@ApiResponse(responseCode = "401", description = "Invalid credentials"),
	@ApiResponse(responseCode = "404", description = "Path not found") })
	@PutMapping("/updatebyquery/{availability}/{guideName}")
	public String updateTouristGuide(@PathVariable ("availability")String availability,@PathVariable ("guideName")String guideName)
	{
		int result= servobj.updateTouristGuide(availability,guideName);
		if(result>0)
			return "TouristGuide record updated";
		else
			return "Problem occured while updating";
		
		
		
		
	}

	
	
	
	
	
	

}
