package com.tns.jn0910.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentmaster")
public class Student {
	@Id
	private int uid;
	@Column(name="StudentName")
	private String name;
	@Column(length=100)
	private String branch;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int uid, String name, String branch) {
		super();
		this.uid = uid;
		this.name = name;
		this.branch = branch;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + ", branch=" + branch + "]";
	}

}
