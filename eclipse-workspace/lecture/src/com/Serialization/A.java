package com.Serialization;

import java.io.Serializable;

public class A implements Serializable{
	
	public A(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	int id;
	String name;
	

}
