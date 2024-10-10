package com.tns.jn0910.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Bank {
	String name;
	String city;

	@Id
	int code;

	@OneToMany(mappedBy = "bank")
	@JsonIgnoreProperties("bank")
	List<Account> accounts;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(String name, String city, int code) {
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

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", city=" + city + ", code=" + code + "]";
	}

}
