package com.Array;


public class University {
	
	public static void main(String[] args) {
		
		College c=new College();
		Student[] studentArray =c.addStudentDetails();
		
		System.out.println("using for each loop");
		
		for(Student s:studentArray)//
		{
			System.out.println("students Id:  "+s.getId());
			System.out.println("Students name:  "+s.getName());
			System.out.println("Students adress:   "+s.getAdress());
		}
	}

}
