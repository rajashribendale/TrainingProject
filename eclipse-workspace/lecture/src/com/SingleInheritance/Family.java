package com.SingleInheritance;


public class Family {

	@Override
	public String toString() {
		return "Family [name=" + name + ", age=" + age + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	String name;
	int age;

	public void m1() {

		System.out.println("Father");
	}

	
}
