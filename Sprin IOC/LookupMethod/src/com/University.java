package com;

public class University {
	private int id;
	private String name;
	private college college;

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

	public college getCollege() {
		return college;
	}

	public void setCollege(college college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", college=" + college + "]";
	}

}
