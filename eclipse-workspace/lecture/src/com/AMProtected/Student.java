package com.AMProtected;

public class Student {

	protected int id;
	protected String name;
	protected String adress;
	protected long mobileNo;

	protected void GetstudentDetails() {

		System.out.println("All Student Details");

	}
//	we can do like this also in protected 

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", adress=" + adress + ", mobileNo=" + mobileNo + "]";
	}

//	public static void main(String[] args) {
//		Student s= new Student();
//		s.id=12;
//		s.name="raj";
//		System.out.println(s.id+""+s.name);
//		s.M1();
//	}
//	
//	
//	
}
