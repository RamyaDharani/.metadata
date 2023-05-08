package com.Reveiw1.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Reveiw1.Entity.TouristGuideLogin;
import com.Reveiw1.Service.TouristGuideLoginService;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/user")
public class TouristGuideLoginController {
	
 @Autowired
 private TouristGuideLoginService  lser;
	
 @PostMapping("/log")
 public String login(@RequestBody Map<String,String>loginData)
 {
  String username=loginData.get("username");
  String password=loginData.get("password");
  String result=lser.checkLogin(username,password);
  return result;
 }
 @PutMapping("/put")
 public TouristGuideLogin putUser(@RequestBody  TouristGuideLogin cl)
 {
  return lser.putUser(cl);
 }
 @PostMapping("/adduser")
 public TouristGuideLogin AddUser(@RequestBody TouristGuideLogin cl)
 {
  return lser.addUser(cl);
 }
	
 @GetMapping("/showall")
 public List< TouristGuideLogin> listAll()
 {
  return lser.getUser();
 }
}
