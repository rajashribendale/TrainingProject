package com.SuperThisDefault;

public class B extends A {

	B() {
		this(11);
		System.out.println("Deafault Const of class b");
	}

	B(int i) {
		this('c');
		System.out.println("single parameter");
	}

	B(char c) {
		System.out.println("Char parameter pass");
	}

	public static void main(String[] args) {

		B b = new B();

	}
}