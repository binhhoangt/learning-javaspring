package com.example.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springaop.data.Dao2;

@Service
public class Business2 {
	@Autowired
	private Dao2 dao;
	
	public String calculateSomething() {
		return dao.retrieveSomething();
	}

}
