package com.EducationLoan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class User {
	@Id
	
	private int Id;
	private String Email;
	private String Username;
	private String MobileNumber;
	
	private String UserRole;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getUserRole() {
		return UserRole;
	}
	public void setUserRole(String userRole) {
		UserRole = userRole;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Email=" + Email + ", Username=" + Username + ", MobileNumber=" + MobileNumber
				+ ", UserRole=" + UserRole + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
