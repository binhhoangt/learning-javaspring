package com.example.demo.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.springbasics.basic.BinarySearchImpl;
import com.example.demo.springbasics.xml.XmlPersonDAO;

public class DemoXmlContextApplication {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(DemoScopeApplication.class);
	
	public static void main(String[] args) {

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		// Application Context
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			LOGGER.info("Beans Loaded -> {}",
					(Object)applicationContext.getBeanDefinitionNames());
			XmlPersonDAO person =
					applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(person);	
			System.out.println(person.getXmlJdbcConnection());	
		}
	}

}
