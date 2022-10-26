package com.example.demo.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.springbasics.basic.BinarySearchImpl;
import com.example.demo.springbasics.cdi.SomeCdiBusiness;
import com.example.demo.springbasics.scope.PersonDAO;

@Configuration
@ComponentScan
public class DemoCdiApplication {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(DemoCdiApplication.class);

	public static void main(String[] args) {

		// Application Context
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(DemoCdiApplication.class)){
			SomeCdiBusiness business =
					applicationContext.getBean(SomeCdiBusiness.class);
			
			LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());			
		}
	}

}
