package com.example.demo.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.example.demo.springbasics.basic.BinarySearchImpl;
import com.example.demo.springbasics.scope.PersonDAO;

@Configuration
public class DemoScopeApplication {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(DemoScopeApplication.class);

	public static void main(String[] args) {

		// Application Context
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(DemoScopeApplication.class)){
			PersonDAO personDao =
					applicationContext.getBean(PersonDAO.class);
			
			PersonDAO personDao2 =
					applicationContext.getBean(PersonDAO.class);
			
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcConnection());
			
			LOGGER.info("{}", personDao2);
			LOGGER.info("{}", personDao2.getJdbcConnection());			
		}
	}

}
