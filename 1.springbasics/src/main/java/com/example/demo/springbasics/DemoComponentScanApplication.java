package com.example.demo.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.springbasics.basic.BinarySearchImpl;
import com.example.demo.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.example.demo.componentscan")
public class DemoComponentScanApplication {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(DemoComponentScanApplication.class);

	public static void main(String[] args) {

		// Application Context
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(DemoComponentScanApplication.class)){
			ComponentDAO componentDAO =
					applicationContext.getBean(ComponentDAO.class);
			
			LOGGER.info("{}", componentDAO);				
		}
	}

}
