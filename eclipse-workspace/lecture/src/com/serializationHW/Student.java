package com.serializationHW;




import java.io.Serializable;


public class Student implements Serializable{
	public Student(int sid, String sname, Adress string) {
	
		this.sid = sid;
		this.sname = sname;
		this.adress = string;
	}
	int sid;
	String sname;
	Adress adress;
	
	

}
