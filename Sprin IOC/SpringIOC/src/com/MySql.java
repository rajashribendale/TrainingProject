package com;

public class MySql implements Connection{

	@Override
	public void conOn() {
System.out.println("My sql connection on");		
	}

	@Override
	public void conOf() {
		System.out.println("My sql connection off");		
	}

}
