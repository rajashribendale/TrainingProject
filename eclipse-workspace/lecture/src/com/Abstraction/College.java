package com.Abstraction;

import com.mix.student;

public abstract class College {

	public  void stuDetails() {
		Student s = new Student();
		s.i = 11;
		s.name = "ABc";
		s.adress = "pune";
		s.mobileno = 876543978l;
	//	return s;
System.out.println(s.i);
	}

	public abstract void Id();

}
