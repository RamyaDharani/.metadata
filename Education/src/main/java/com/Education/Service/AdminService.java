package com.Education.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Education.Model.LoanApplicationModel;
import com.Education.Repository.LoanApplicationRepository;

@Service
public class AdminService {
	@Autowired
	LoanApplicationRepository lorep;
	public List<LoanApplicationModel> getAdmin()
	{
		return lorep.findAll();
	}
 
	public LoanApplicationModel saveDetails(LoanApplicationModel lobj)
	{
		return lorep.save(lobj);
	}

	public LoanApplicationModel updatedetails(LoanApplicationModel lobj1) {
		
		return lorep.saveAndFlush(lobj1);
	}

	public String  deletedetails(int loanId) 
	{
		 lorep.deleteById(loanId);
		return "deleted Successfully";
		
	}
	
}
