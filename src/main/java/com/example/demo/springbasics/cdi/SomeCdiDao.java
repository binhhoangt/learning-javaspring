package com.example.demo.springbasics.cdi;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named
public class SomeCdiDao {
	
	public int[] getData() {
		return new int[] {5, 89, 100};
	}

}
