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
import com.Education.Service.AdminService;

@RestController

public class AdminController {
	
	@Autowired
	AdminService aserv;
	@GetMapping("/getAdmin")

	public List<LoanApplicationModel> getAdmin()
	{
		List<LoanApplicationModel>  alist=aserv.getAdmin();
		return alist;
	}
	@PostMapping("/postuser")
	public LoanApplicationModel saveDetails(@RequestBody LoanApplicationModel lobj)
	{
		return aserv.saveDetails(lobj);
				
	}
	@PutMapping("/putuser")
	public LoanApplicationModel updatedetails(@RequestBody LoanApplicationModel lobj1)
	{
		return aserv.updatedetails(lobj1);
	}
	@DeleteMapping("deleteuser/{loanId}")
	public String  DeleteDetails(@PathVariable("loanId") int loanId)
	{
		return aserv.deletedetails(loanId);
	}
}
