package com;

public class GLvariable {

	int i = 10;
	String name ="rajshri";

 public void m1() {
	System.out.println("m1 method");
	int rollno = 20;
	String name ="java class";
	System.out.println(rollno);
	System.out.println(name);
	
}
 public static void main(String[] args) {
	
	 System.out.println("Exponent class");
	 GLvariable g = new GLvariable();
	 System.out.println(g.i);
	 System.out.println(g.name);
	 g.m1();
	 
	 
}
}