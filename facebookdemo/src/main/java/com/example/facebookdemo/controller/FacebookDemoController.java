package com.example.facebookdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FacebookDemoController {
	
	@RequestMapping(value="/signin",method=RequestMethod.GET)
	
	public String Signin()
	{
		return"I'M INSIDE SIGNIN PAGE";
	}
	
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public String SignUp()
	{
		return"I'M INSIDE SIGNUP PAGE";
	}

	
	
}
