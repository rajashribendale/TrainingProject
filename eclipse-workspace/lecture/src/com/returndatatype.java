package com;


public class returndatatype {
	public void m()
	
	{
		System.out.println("method");
	}
	public int m1()
	{
		return 20 ;
	}
	public String m2()
	{
		return "rajshri";
	}
	public char m3()
	{
		return 'R';
	}
	public boolean m4()
	{
		return true;
		
	}

	public student S()
	{
		student s = new student();
		s. rollno =10;
		s.name="XYZ";
		return s;
		
		
	}
	public Employee E()
	{
		Employee e = new Employee();
	
		e.id = 101;
		e.name ="abc";
		return e;
		 
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		returndatatype r = new returndatatype();
		student s = r.S();
		System.out.println(s.rollno);
		System.out.println(s.name);
		
		Employee e =r.E();
		System.out.println(e.id);
		System.out.println(e.name);
				
		int i= r.m1();
		System.out.println(i);
		String d = r.m2();
		System.out.println(d);
		char c = r.m3();
		System.out.println(c);
		boolean b  = r.m4();
		System.out.println(b);
	
		
		
		
	}

}
