package com.finalKeyward;

public class college extends Student {

	public void m2() {

		System.out.println("m2 method");
	}

	@Override
	public void m1() {
		System.out.println("overided method");
	}

	public static void main(String[] args) {

		college c = new college();
//		c.rollno=11;
		c.name = "rajshri";
		System.out.println(c.rollno);
		System.out.println(c.name);
		c.m1();
		c.m2();
	}
}