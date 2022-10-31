package com.example.demo.springbasics.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value="prototype", // value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,
		proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbConnection {
	public JdbConnection() {
		System.out.println("JDBC Connection");
	}
}
