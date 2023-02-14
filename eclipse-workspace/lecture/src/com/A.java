package com;

public class A {

	static {
		System.out.println("static method");

	}

	A() {
		System.out.println("default constructor");
	}

	public void B() {

		System.out.println("main method");

	}

	{
		System.out.println("non static method");
	}

	public static void main(String[] args) {
		System.out.println("main method");

	}
}

