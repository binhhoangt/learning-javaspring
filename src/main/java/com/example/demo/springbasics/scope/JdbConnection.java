package com.example.demo.springbasics.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value="prototype",
		proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbConnection {
	public JdbConnection() {
		System.out.println("JDBC Connection");
	}
}
