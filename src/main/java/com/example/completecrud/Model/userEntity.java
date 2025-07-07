package com.example.completecrud.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class userEntity {
	@Id
	public long id;
	public String name;
	public String email;
	public Address address;
	
	public userEntity() {
		super();
	}
	
	public userEntity(long id, String name, String email, Address address) {
		super();
		this.id=id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "userDto [name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
}
