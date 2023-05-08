package com.Reveiw1.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Reveiw1.Entity.TouristGuideLogin;
import com.Reveiw1.Repository.TouristGuideLoginRepository;
@Service
public class TouristGuideLoginService {

@Autowired
private TouristGuideLoginRepository lrepo;
public String checkLogin(String username,String psword)
{
 TouristGuideLogin user= lrepo.findByUsername(username);
 if(user==null)
 {
  return "No user found";
 }
 else
 {
  if(user.getPassword().equals(psword))
  {
   return "Login Succesfull";
  }
  else
  {
   return "Login Failed";
  }
 }
} 
public  TouristGuideLogin addUser( TouristGuideLogin cl)
{
 return lrepo.save(cl);
}
public List< TouristGuideLogin> getUser()
{
 return lrepo.findAll();
}
public TouristGuideLogin putUser( TouristGuideLogin cl)
{
 return lrepo.save(cl);
}
}