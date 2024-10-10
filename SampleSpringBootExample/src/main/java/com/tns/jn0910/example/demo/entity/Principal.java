package com.tns.jn0910.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Principal {

	String name;
	long contactNo;
	String Qualification;
	@Id
	String emailId;

	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Principal(String name, long contactNo, String qualification, String emailId) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		Qualification = qualification;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Principal [name=" + name + ", contactNo=" + contactNo + ", Qualification=" + Qualification
				+ ", emailId=" + emailId + "]";
	}

}
