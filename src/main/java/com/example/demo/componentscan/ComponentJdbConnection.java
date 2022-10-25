package com.example.demo.componentscan;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype",
		proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbConnection {
	public ComponentJdbConnection() {
		System.out.println("JDBC Connection");
	}
}
