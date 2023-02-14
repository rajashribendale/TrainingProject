package com.CovarientReturnType;

//Parent Class
public class A {

	public int i;
	public String name;
	

	

	@Override
	public String toString() {
		return "A [i=" + i + ", name=" + name + "]";
	}




	public void M1() {

		System.out.println("M1 Method");
	}

}
