package com.SetterandGetterMethod;

public class Demo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setid(11);
		s.setName("rajshri");
		s.setGrade('A');
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getGrade());
		
		
		Employee e = new Employee();
		e.setId(1);
		e.setName("uday");
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		
	}
	
	

}
