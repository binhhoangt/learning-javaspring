package com.example.demo.springbasics.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch (int[] numbers, int numberToSearchFor) {
		System.out.println(sortAlgorithm);
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);

		return 3;
	}
}
