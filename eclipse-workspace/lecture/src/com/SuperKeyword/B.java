package com.SuperKeyword;

public class B extends A {

	int salary;
	String adress;
	
	public void M2()
	{
		System.out.println("M2 method ");
		System.out.println(super.Rollno);
		System.out.println(super.name);
		super.M1();
	}
	public static void main(String[] args) {
		B b=new B();
		b.M2();
		b.salary=20000;
		b.adress="pune";
		System.out.println(b.salary);
		System.out.println(b.adress);
	}
}
