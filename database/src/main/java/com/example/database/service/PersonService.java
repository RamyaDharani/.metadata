package com.example.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.database.Repository.PersonRepository;
import com.example.database.entity.Person;
@Service
public class PersonService {

	@Autowired
	PersonRepository robj;
	public Person addPerson(Person sobj1) {
		
		return  robj.save(sobj1);
	}

	public List<Person> getPerson() {
		return robj.findAll();
	}

}
