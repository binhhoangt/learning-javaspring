package com.example.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springaop.data.Dao;
import com.example.springaop.data.TrackTime;

@Service
public class Business {
	@Autowired
	private Dao dao;
	
	@TrackTime
	public String calculateSomething() {
		return dao.retrieveSomething();
	}

}
