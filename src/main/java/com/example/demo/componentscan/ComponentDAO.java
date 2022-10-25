package com.example.demo.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
	@Autowired
	ComponentJdbConnection jdbcConnection;
	
	public ComponentJdbConnection getComponentJdbcConnection() {
		return jdbcConnection;
	}
	
	public void setComponentJdbcConnection(ComponentJdbConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}
