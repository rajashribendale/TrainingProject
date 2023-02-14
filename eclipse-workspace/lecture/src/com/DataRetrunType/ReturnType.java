package com.DataRetrunType;

import com.model.Employee;

public class ReturnType {

	public void m()
	{
		System.out.println("no return method");
	}
	public int m1()
	{
		return 10;
	}
	
	public employee addemployeedetail()
	{
		employee e = new employee();
		e.id=20;
		e.name="rajshri";
		return e;
		
	}
	public static void main(String[] args) {
		
		ReturnType RT = new ReturnType();
		RT.m();
		int i=RT.m1();
		System.out.println(i);
		employee e =RT.addemployeedetail();
		System.out.println("employee id:"+e.id);
		System.out.println("employee name:"+e.name);
	}
	
}
