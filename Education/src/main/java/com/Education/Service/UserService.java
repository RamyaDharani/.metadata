package com.Education.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Education.Model.LoanApplicationModel;
import com.Education.Model.UserModel;
import com.Education.Repository.LoanApplicationRepository;
import com.Education.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository urep;
	
	@Autowired
	LoanApplicationRepository lrep;
	
	public String ValidUser(String email,String password)
	{
		UserModel uobj=urep.findByEmail(email);
		if(uobj==null)
		{
			return "No user found";
		}
		else
		{
			if(uobj.getPassword().equals(password))
			{
				return "Login Successfully";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public UserModel newUser(UserModel obj)
	{
		return urep.save(obj);
	}
	public List<UserModel> getUserDetails()
	{
		return urep.findAll();
	}
	public LoanApplicationModel getLoan(int loanId)
	{
		LoanApplicationModel l=lrep.findById(loanId).get();
		return l;
	}
	public UserModel getProfile(int id)
	{
		UserModel u=urep.findById(id).get();
		return u;
	}
	public UserModel putprofile(UserModel uobj) {
		
		return urep.saveAndFlush(uobj);
	}
	public String deleteprofile(int id) {
		urep.deleteById(id);
		return "Deleted Successfully";
	}

}
