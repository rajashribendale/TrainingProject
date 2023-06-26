package com.model;

public class Employee {
	private int id;
	private String name;
	private Company compnay;
	public Employee(int id, String name, Company compnay) {
		super();
		this.id = id;
		this.name = name;
		this.compnay = compnay;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", compnay=" + compnay + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Company getCompnay() {
		return compnay;
	}

}
