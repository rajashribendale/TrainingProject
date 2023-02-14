package com.HWParameterisedMethod.money;

public class Money {

	public void m(int i, int j) {

		System.out.println("Display coinn Details");
		System.out.println(i);
		System.out.println(j);

	}
	
	public void M2(Note C) {
		
		
		
		System.out.println("Display notes Details");
		System.out.println(C.no);
		System.out.println(C.color);
		
		
	}

	public static void main(String[] args) {

		Money M = new Money();
		M.m(5, 10);
		Note n=new Note();
		n.no=20;
		n.color="Green";
		M.M2(n);
	}
}
