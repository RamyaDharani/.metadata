package com.example.database.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.entity.Person;

@Repository

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
