package com.serializationHW;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Adress implements Serializable {
	public Adress(String ldr, String padr, String pincode) {

		this.ldr = ldr;
		this.padr = padr;
		this.pincode = pincode;
	}

	String ldr;
	String padr;
	transient String pincode;

	public static void main(String[] args) throws IOException {
		Adress a = new Adress("jalgaon", "pune", "41110");
		
		Student s = new Student(11, "a", a);

		FileOutputStream fout = new FileOutputStream("output.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s);
		out.close();
		System.out.println("success");

	}

}
