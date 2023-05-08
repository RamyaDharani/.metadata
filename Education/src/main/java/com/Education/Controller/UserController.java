package com.Education.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Education.Model.LoanApplicationModel;
import com.Education.Model.LoginModel;
import com.Education.Model.UserModel;
import com.Education.Service.LoanApplicationService;
import com.Education.Service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userv;
	@Autowired
	LoanApplicationService lserv;
	@GetMapping("/fetch")
	public List<UserModel> getUserDetails()
	{
		return userv.getUserDetails();
	}
	@PostMapping("/userlogin")
	public String validateUser(@RequestBody LoginModel lmobj)
	{
		return userv.ValidUser(lmobj.getEmail(), lmobj.getPassword());
	}
	@PostMapping("/usersignup")
	public UserModel newUser(@RequestBody UserModel uobj)
	{
		return userv.newUser(uobj);
	}
	@GetMapping("/getloan/{loanId}")
	public LoanApplicationModel getLoan(@PathVariable int loanId)
	{
		return userv.getLoan(loanId);
	}
	@GetMapping("/getprofile/{id}")
	public UserModel getProfile(@PathVariable int id)
	{
		return userv.getProfile(id);
	}
	@PutMapping("/putdetail")
	public UserModel putprofile(@RequestBody UserModel uobj)
	{
		return userv.putprofile(uobj);
	}
	@DeleteMapping("/deletedetail/{id}")
	public String deleteprofile(@PathVariable("id") int id)
	{
		return userv.deleteprofile(id);
	}
	

}
