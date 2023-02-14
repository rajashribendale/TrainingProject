package com.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class B extends A{ 
	public B(int id, String name, String adress) {
		super(id, name);
		this.adress = adress;
	}

	String adress;
	
public static void main(String[] args) throws IOException {
	B b=new B(11, "a", "pune");
	
//	System.out.println(b.id+""+b.name+""+b.adress);
	
	FileOutputStream fout=new FileOutputStream("output1.txt");
	ObjectOutputStream o= new ObjectOutputStream(fout);
	o.writeObject(b);
	o.close();
	System.out.println("success");
	
	
	
	
	
	
}
}
