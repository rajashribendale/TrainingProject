package com.finalKeyward;

public class Student { // we can not extends this class in other class

	final int rollno = 11; // value is fixed
	String name;

	public void m1() // if we use final keyward then we can't change anything in this method
	{

		System.out.println("M1 method");

	}

	public  final void m3() {
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="b";
			System.out.println(s1.rollno);
			System.out.println(s1.name);
		}
	
	
}
