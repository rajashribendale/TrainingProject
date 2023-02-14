package com.Parameterizedmethod;



public class Parameterized {
	
	public void m()

	{
		System.out.println("no parameter method");
	}

	public void m1(int i, int j) {
		System.out.println("double paramter");
		System.out.println(i);
		System.out.println(j);
	}

	public void StudentDetails(StudentP S) {
		System.out.println("Student detials");
		System.out.println("sturollno:" + S.rollno);
		System.out.println("Stuname:" + S.name);
	}

	public static void main(String[] args) {
		Parameterized P = new Parameterized();

		P.m();
		P.m1(10, 20);

		StudentP s = new StudentP();
		s.rollno = 10;
		s.name = "Rajshri";

		P.StudentDetails(s);
		
	}

}
