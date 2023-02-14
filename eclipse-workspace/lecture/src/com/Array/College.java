package com.Array;

public class College {
	public Student[] addStudentDetails() {
		
	
	Student s=new Student();
	s.setId(11);
	s.setName("rajshri");
	s.setAdress("pune");
		
	Student s1=new Student();
	s1.setId(12);
	s1.setName("Bhagyshri");
	s1.setAdress("Indore");
	
	Student s2=new Student();
	s2.setId(13);
	s2.setName("ujjwala");
	s2.setAdress("hyderbad");
	
	Student s3=new Student();
	s3.setId(14);
	s3.setName("shruti");
	s3.setAdress("nashik");
	
	Student[] studentArray={s,s1,s2,s3};
	return studentArray;
	
}
}
