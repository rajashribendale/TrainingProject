package com.Typecasting;

public class WideningCasting {

	
	public static void main(String[] args) {
		
		int myInt=10;
		
		double myDouble=myInt;
		long myLong=myInt;
		float myFloat=myInt;
		
		
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myLong);
		System.out.println(myFloat);
		
		
		
		System.out.println("***************");
		
		
		long l=123456l;
		float f1=l;
		double D=l;
		System.out.println(l);
		System.out.println(f1);
		System.out.println(D);
		System.out.println("***********");
		
		float f=10.567f;
		double d=f;
				
		System.out.println(d);
		
		
		
		
		
	}

}
