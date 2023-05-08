package com.EducationLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EducationLoan.Model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,String> {

}
