package com.HWParameterisedMethod;


public class University {
	
	public void displayStudent(student s) {

		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.adress);
	}

	public void displayAllstudent(AllStudent all) {

		System.out.println("Display all student Details");
		System.out.println("stu id-" + all.s.id);
		System.out.println("stu name-" + all.s.name);
		System.out.println("stu adress-" + all.s.adress);

		System.out.println("stu id-" + all.s1.id);
		System.out.println("stu name-" + all.s1.name);
		System.out.println("stu adress-" + all.s1.adress);

		System.out.println("stu id-" + all.s2.id);
		System.out.println("stu name-" + all.s2.name);
		System.out.println("stu adress-" + all.s2.adress);

	}

	public static void main(String[] args) {

		College college = new College();

		college.addStudentDetails();
		college.AllStudentDetails();

	}
}


