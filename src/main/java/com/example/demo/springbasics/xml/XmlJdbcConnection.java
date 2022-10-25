package com.example.demo.springbasics.xml;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public class XmlJdbcConnection {
	public XmlJdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
