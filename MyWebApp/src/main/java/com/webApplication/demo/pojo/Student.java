package com.webApplication.demo.pojo;

import org.springframework.stereotype.Component;

@Component("StudentObj")
public class Student {
	private int id;
	private String sName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void listen() {
		System.out.println("Student Listen called");
	}
}
