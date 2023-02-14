package com;

public class allblocks {

	static
	{
		System.out.println("static blocks ");
	}
	
	{
	System.out.println("Non static block");
	}
	
	allblocks(){
		System.out.println("Default constructor");
	}
	public void m() {
		System.out.println("method");
	}
	public static void main(String[] args) {
		System.out.println("allblocks");
		allblocks b = new allblocks();
		
		b.m();
		
		
		
	}
}

