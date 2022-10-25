package com.example.demo.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.springbasics.basic.BinarySearchImpl;
import com.example.demo.springbasics.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class DemoPropertiesApplication {

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		// Application Context
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(DemoPropertiesApplication.class)){
			SomeExternalService service = 
					applicationContext.getBean(SomeExternalService.class);
			
			System.out.println(service.returnServiceURL());			
		}
	}

}
