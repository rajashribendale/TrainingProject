package com.HierarchicalInheritance;

public class Ortho extends Surgeon {
	
	String Name="Dr.Mahajan";
	
	
	public void M3()
	{
		System.out.println("Ortho Specialist");
	}

	public static void main(String[] args) {
	
		
	Ortho o=new Ortho();
	o.M1();
	
	o.M3();
	System.out.println(o.Name);
	
	System.out.println("*************");
	
	ENT e=new ENT();
	e.M1();
	e.M2();
	System.out.println(e.name);
	
	
	}
	}



