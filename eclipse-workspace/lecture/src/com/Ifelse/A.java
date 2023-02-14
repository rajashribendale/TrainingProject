package com.Ifelse;

public class A {
	
	public void m1()
	{
	
		int marks =85;
		if (marks>35) {
			System.out.println("Stu pass");
		}
		else
		{
			System.out.println("Fail");
		}
		if (marks<=60)
		{
			System.out.println("pass with first class ");
		}else if(marks <70) {
			System.out.println("pass with disti");
			
		}else if(marks>80) {
			System.out.println("Topper in college");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		A a=new A();
		a.m1();
	}
}


