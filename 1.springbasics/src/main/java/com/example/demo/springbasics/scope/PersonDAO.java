package com.example.demo.springbasics.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
	@Autowired
	JdbConnection jdbcConnection;
	
	public JdbConnection getJdbcConnection() {
		return jdbcConnection;
	}
	
	public void setJdbcConnection(JdbConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}
