package com.example.demo.springbasics.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public class XmlPersonDAO {
	XmlJdbcConnection xmlJdbcConnection;
	
	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}
	
	public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
		this.xmlJdbcConnection = jdbcConnection;
	}
}
