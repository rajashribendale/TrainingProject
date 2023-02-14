package com.ThisKeyword;

public class Q extends P{
	
	
	long mono=98765432l;
	String adress="pune";
	public void M3() {
		System.out.println("M3 method");
		System.out.println(super.no);   //super keyword is used for parent class
		System.out.println(super.name);
	}

	public void M4() {
		
		
		System.out.println("M4 method");
		System.out.println("mobile no of stu"+this.mono);    //this keyword is used within class
		System.out.println(this.adress);
		m1();
		m2();
		
		
	}
	public static void main(String[] args) {
		
		Q q= new Q();
		q.M3();
		q.M4();
		
		
	}
	
}
