package com.spring.restapi.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	int sid;
    String sname;
    public String getStech() {
		return stech;
	}
	public void setStech(String stech) {
		this.stech = stech;
	}
	String stech;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", stech=" + stech + "]";
	}
	
}
