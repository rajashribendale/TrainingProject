package com.AccessModifier;

public class PrivateAM {
	
	private int id=11;
	private String  name="rajshri";
	



private void m1()
{
	
	System.out.println("M1 method");
	

}
public static void main(String[] args) {
	PrivateAM s=new PrivateAM();
	System.out.println(s.id);
	System.out.println(s.name);
	s.m1();

}
}