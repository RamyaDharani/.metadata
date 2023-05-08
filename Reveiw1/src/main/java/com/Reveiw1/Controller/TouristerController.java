package com.Reveiw1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Reveiw1.Entity.Tourister;
import com.Reveiw1.Service.TouristerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;



@RestController
public class TouristerController {
	@Autowired 
	TouristerService objserv;
	
	@Operation(summary = "post  Tourister detail ")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Tourister data posted successfully"),
	@ApiResponse(responseCode = "401", description = "Invalid credentials"),
	@ApiResponse(responseCode = "404", description = "Path not found") })
	
	@PostMapping("/posttouristerdetails")
	public Tourister add(@RequestBody Tourister sobj1 )
	{
		return objserv.addPerson(sobj1);
	}
	

	@Operation(summary = "get  Tourister detail ")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Tourister data gotted successfully"),
	@ApiResponse(responseCode = "401", description = "Invalid credentials"),
	@ApiResponse(responseCode = "404", description = "Path not found") })
	
	@GetMapping("/gettouristerdetails")
	public List <Tourister> get()
	{
		return objserv.getPerson();
		
	}

}
