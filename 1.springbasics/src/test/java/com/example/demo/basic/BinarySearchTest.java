package com.example.demo.basic;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.springbasics.DemoBasicApplication;
import com.example.demo.springbasics.basic.BinarySearchImpl;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=DemoBasicApplication.class)
public class BinarySearchTest {
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		// call method on binarySearch
		int actualResult = binarySearch.binarySearch(new int[] {}, 5);

		// check if the value is correct
		assertEquals(3, actualResult);
	}

}