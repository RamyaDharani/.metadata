package com.example.springdemo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo1Controller {
	@ResponseBody
    @RequestMapping(value="/",method=RequestMethod.GET)
	public String Welcome()
	{
		return "WELCOME";
	}
	
}
