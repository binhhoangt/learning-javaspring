package com.example.database.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.entity.Person;

@Repository
public interface PersonSpringDataRepository  
		extends JpaRepository<Person, Integer>{

}
