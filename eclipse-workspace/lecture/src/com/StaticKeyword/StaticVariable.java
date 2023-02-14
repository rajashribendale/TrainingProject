package com.StaticKeyword;

public class StaticVariable {

	int i = 11;
	int rollno = 101;
	static String name = "Rajshri";

	static {
		System.out.println(" Static constructor");
	}

	public void m1() {
		System.out.println("non Static ");
		System.out.println(name);

	}

	public static void main(String[] args) {
		System.out.println("main method");
		StaticVariable sv = new StaticVariable();
		sv.m1();
		System.out.println(sv.i);
		System.out.println(sv.rollno);
	}

}
