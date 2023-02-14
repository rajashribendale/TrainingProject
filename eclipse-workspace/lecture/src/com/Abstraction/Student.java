package com.Abstraction;

public class Student extends College {

	public int i;
	public String name;
	public String adress;
	public long mobileno;

	@Override
	public void Id() {

		System.out.println("Student id Details");
	}

	public static void main(String[] args) {

		College c = new Student();
		c.Id();
		c.stuDetails();

//		Student s=new Student();
//		Student S = s.stuDetails();
//		System.out.println(S.i);
//		System.out.println(S.name);
//		System.out.println(S.adress);
//		System.out.println(S.mobileno);

	}

	
}
