package com.EducationLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EducationLoan.Model.LoanApplication;

@Repository

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Integer> {

}
