package com.example.demo.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.springbasics.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class DemoBasicApplication {

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		// Application Context
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(DemoBasicApplication.class)) {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			
			int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
			
			System.out.println(result);			
		}
	}

}
