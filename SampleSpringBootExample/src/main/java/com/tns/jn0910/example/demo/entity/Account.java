package com.tns.jn0910.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Account{
	String accName;
	@Id
	int AccNo;
	String Address;
	int balance;
	
	@ManyToOne
	@JsonIgnoreProperties("accounts")
	//@JoinColumn(name="code")
	Bank bank;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String accName, int accNo, String address, int balance) {
		super();
		this.accName = accName;
		AccNo = accNo;
		Address = address;
		this.balance = balance;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Accounts [accName=" + accName + ", AccNo=" + AccNo + ", Address=" + Address + ", balance=" + balance
				+ "]";
	}
	
	
	 


}
