package com.practiceReturnType;

public class Department {

	public void displayEmployeeDetails1() {

		System.out.println("Display Employee Deatails");

		Company c = new Company();
		Employee E = c.AddEmployeeDetails1();

		System.out.println("Emp Id:" + E.id);
		System.out.println("Emp Id:" + E.name);
		System.out.println("Emp Id:" + E.adress);

	}

	public void displayAllEmpoyeeDetails() {

		System.out.println("Display AllREmployee details");

		Company c = new Company();
		AllEmployee all = c.AddAllEmployeeDetails();

		System.out.println("Emp Id:" + all.e1.id + "  " + all.e1.name + "   " + all.e1.adress);
		System.out.println("Emp Id:" + all.e2.id + "   " + all.e2.name + "   " + all.e2.adress);
		System.out.println("Emp Id:" + all.e3.id + "   " + all.e3.name + "   " + all.e3.adress);

	}
	
	public static void main(String[] args) {
		Department d=new Department()	;
		d.displayEmployeeDetails1();
		System.out.println("***************");
		d.displayAllEmpoyeeDetails();
	}
}

