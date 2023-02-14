package com;

public class practicereturn {
	public void m()
	{
	 System.out.println("metod");
	}

	public int m1()
	{
	return 20;
	
	}
	public String m2()
	{
		return "rajshri";
		
	}
	public static void main(String[] args) {
		System.out.println("main method)");
		practicereturn p = new practicereturn();
		int i = p.m1();
		System.out.println(i);
		String s = p.m2();
		System.out.println(s);
		
	}
}
