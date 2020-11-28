package com.capgemini.demoapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //injecting this class's only one object to the container
@Scope(value="prototype") //this will create multiple object
public class Employee {
	private int id;
	private String name;
	private String dept;
	@Autowired // to connect with the laptop object in container
	private Laptop laptop;
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Employee() {
		super();
		System.out.println("Object created!!");
	}
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void show() {
		System.out.println("Within the show method of employee object!!");
		laptop.compile();
	}

}
