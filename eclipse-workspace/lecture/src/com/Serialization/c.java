package com.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class c {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("output1.txt"));
		B b = (B) in.readObject();
		System.out.println(b.id + "" + b.name + "" + b.adress);
		in.close();

	}

}
