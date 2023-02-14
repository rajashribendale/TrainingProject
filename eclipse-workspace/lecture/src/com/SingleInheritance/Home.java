package com.SingleInheritance;

public class Home extends Family {
	
	
	

	public static void main(String[] args) {

		Family F = new Family();
		F.age = 56;
		F.name = "Ganesh";
		System.out.println(F);

		Family F2 = new Family();
		F2.age = 36;
		F2.name = "Rajshri";
		System.out.println(F2);
		
		F.m1();
	}

}