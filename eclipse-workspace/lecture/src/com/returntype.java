package com;

public class returntype {

	public void m() {
	System.out.println("No return ");
	}
	public int m2() {
	return 10;
	}
	
	public String m3() {
		return "Rajshri";
	}
	public String m4() {
		return "Exponent class student";
		
	}
	public static void main(String[] args) {
		returntype t =  new	returntype();
		int i = t.m2();
		System.out.println(i);
		String s = t.m3();
		System.out.println(s);
		String h = t.m4();
		System.out.println(h);
		
		
	}
	
}
