package com.example.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	
	@TrackTime
	public String retrieveSomething() {
		return "Dao";
	}

}
