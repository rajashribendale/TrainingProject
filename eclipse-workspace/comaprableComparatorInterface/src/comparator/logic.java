package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class logic {
	public static void main(String[] args) {

		Employee e = new Employee(101, "Rajshri", "Ahmednagar");
		Employee e1 = new Employee(105, "Ashmita", "Satara");
		Employee e2 = new Employee(102, "shweta", "Mumbai");
		Employee e3 = new Employee(103, "Sharddha", "Nashik");
		Employee e4 = new Employee(106, "zaid", "PCMC");
		Employee e5 = new Employee(108, "jayu", "Pune");

		List<Employee> listofEmployees = new ArrayList<Employee>();
		listofEmployees.add(e);
		listofEmployees.add(e1);
		listofEmployees.add(e2);
		listofEmployees.add(e3);
		listofEmployees.add(e4);
		listofEmployees.add(e5);

		System.out.println("Before sorting");
		for (Employee employee : listofEmployees) {
			System.out.println(employee.toString());

		}
		System.out.println("sort employee id ");
		Collections.sort(listofEmployees, new sortbyEmployeeId());
		for (Employee employee : listofEmployees) {
			System.out.println(employee.toString());
		}
		System.out.println("sort Employee name ");
		Collections.sort(listofEmployees, new sortbyEmployeename());
		for (Employee employee : listofEmployees) {
			System.out.println(employee.toString());

		}
		//name wise id change
		System.out.println("sort Employee name and Id");
		Collections.sort(listofEmployees, new sortEmployeeNameID());
		for (Employee employee : listofEmployees) {
			System.out.println(employee.toString());

	}
}
}
