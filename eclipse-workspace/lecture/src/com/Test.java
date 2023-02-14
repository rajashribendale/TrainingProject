package com;

public class Test {

	static {
		System.out.println("static method");
	}
	Test(){
		
		System.out.println("defaulter constructor");
	}
	{
		System.out.println("non static method");
	}
	public void m1()
	{
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		System.out.println("main method ");
	}
	}

