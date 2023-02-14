package com.practiceReturnType;

public class Company {
	public Employee AddEmployeeDetails1()
	{
		Employee e = new Employee();
		e.id=10;
		e.name="rajshri";
		e.adress="pune";
		
		return (e);
		
		
	}
	
	public  AllEmployee AddAllEmployeeDetails()
	{
		AllEmployee all = new AllEmployee();
		all.e1.id=11;
		all.e1.name="A";
		all.e1.adress="pune";
		
		all.e2.id=12;
		all.e2.name="b";
		all.e2.adress="nashik";
		
		all.e3.id=13;
		all.e3.name="c";
		all.e3.adress="nagar";
		return(all);
		
		
		
		
}

}
