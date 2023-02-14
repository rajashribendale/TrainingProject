package com.StaticKeyword;


public class A {
	
	static  int batchno=24;
	String name;
	static String  Instname="Exponent";
	

	public void GetstudentData()
	{
		A a=new A();
		a.name="Asmita";
		System.out.println("Batch no"+A.batchno+"  "+a.name+"  "+A.Instname);
		
		A a1=new A();
		a1.name="Samruddhi";
		System.out.println(A.batchno+"  "+a1.name+"  "+A.Instname);
		
		
		A a2=new A();
		a2.name="Rajshri";
		System.out.println(A.batchno+"  "+a2.name+"  "+A.Instname);
		
		A a3=new A();
		a3.name="Shraddha";
		System.out.println(A.batchno+"  "+a3.name);
		
	}
	
	
	public static void main(String[] args) {
		
		A an =new A();
		an.GetstudentData();
		
		
	}
	
}
