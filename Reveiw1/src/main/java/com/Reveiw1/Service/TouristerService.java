package com.Reveiw1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Reveiw1.Entity.Tourister;
import com.Reveiw1.Repository.TouristerRepository;


@Service
public class TouristerService {
	@Autowired
	TouristerRepository objrep;

public Tourister addPerson(Tourister sobj1) {
		
		return  objrep.save(sobj1);
	}

	public List<Tourister> getPerson() {
		return objrep.findAll();
	}
}
