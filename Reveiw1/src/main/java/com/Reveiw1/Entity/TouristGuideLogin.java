package com.Reveiw1.Entity;
 import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

 @Entity
 @Table(name="test")
 public class TouristGuideLogin
 {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id;
  private String username;
  private String password;
  private String phonenumber;
  private String guardian;
  private String gender;
  private String age;
  private String dob;
  private String city;
  private String address;
  private String status;
  
  
  public int getId() {
	   return id;
	  }
	  public void setId(int id) {
	   this.id = id;
	  }
  public String getPhonenumber() {
   return phonenumber;
  } 
  public void setPhonenumber(String phonenumber) {
   this.phonenumber = phonenumber;
  }
  public String getGuardian() {
   return guardian;
  }
  public void setGuardian(String guardian) {
   this.guardian = guardian;
  }
  public String getGender() {
   return gender;
  }
  public void setGender(String gender) {
   this.gender = gender;
  }
  public String getAge() {
   return age;
  }
  public void setAge(String age) {
   this.age = age;
  }
  public String getDob() {
   return dob;
  }
  public void setDob(String dob) {
   this.dob = dob;
  }
  public String getCity() {
   return city;
  }
  public void setCity(String city) {
   this.city = city;
  }
  public String getAddress() {
   return address;
  }
  public void setAddress(String address) {
   this.address = address;
  }
  public String getStatus() {
   return status;
  }
  public void setStatus(String status) {
   this.status = status;
  }

 
  public String getUsername() {
   return username;
  }
  public void setUsername(String username) {
   this.username = username;
  }
  public String getPassword() {
   return password;
  }
  public void setPassword(String password) {
   this.password = password;
 }
 }

