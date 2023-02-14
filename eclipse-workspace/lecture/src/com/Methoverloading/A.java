package com.Methoverloading;

public class A {

	public void m1()
	{
		System.out.println("M1 method of parent class");
	}
	
	public  void m2(int i )
	{
	
		System.out.println("single paramter pass");
		System.out.println(i);		
	}
	
	
	A()
	{
		System.out.println("deafault constructor");
	}
	
	
	public int m4()
	{
		System.out.println("return type ");
		return (7);
	}
	
	
}
