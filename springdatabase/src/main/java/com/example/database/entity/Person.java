package com.example.database.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String location;
	private Date birthDate;
	
	public Person() {
		
	}
	
	public Person(int id, String name, String location, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = date;
	}
	
	public Person(String name, String location, Date birthDate) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return this.location;
	}
	public void setBirthDate(Date birthday) {
		this.birthDate = birthday;
	}
	
	public Date getBirthDate() {
		return this.birthDate;
	}
	
	@Override
	public String toString() {
		return String.format("\nPerson [id=%s, name=%s, location=%s, birthday=%s", id, name, location, birthDate);
	}
}
