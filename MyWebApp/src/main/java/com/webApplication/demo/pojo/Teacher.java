package com.webApplication.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void teaches() {
		System.out.println("Teacher Teaches Called");
	}
}
