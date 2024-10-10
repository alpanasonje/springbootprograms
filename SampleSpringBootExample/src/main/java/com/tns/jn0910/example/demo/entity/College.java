package com.tns.jn0910.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;

@Entity
public class College {
	String name;
	String city;

	@Id
	int code;

	@OneToOne
	Principal principal;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(String name, String city, int code) {
		super();
		this.name = name;
		this.city = city;
		this.code = code;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", city=" + city + ", code=" + code + ", principal=" + principal + "]";
	}

}
