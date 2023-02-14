package comaprableComparatorInterface.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mainClass {
	public static void main(String[] args) {
		
		
		student s=new student(11,"Ajay","pune");
		student s1 = new student(15, "rajshri", "pcmc");
		student s2 = new student(10, "vaishnvi", "nigdi");
		student s3 = new student(26, "sushmita", "Bhosari");
		student s4 = new student(25, "Shraddha", "Pune");
		student s5 = new student(5, "Shweta", "Solapur");
		
		List<student>listofstudent=new ArrayList<student>();
		listofstudent.add(s);
		listofstudent.add(s1);
		listofstudent.add(s2);
		listofstudent.add(s3);
		listofstudent.add(s4);
		listofstudent.add(s5);
		System.out.println("Before sorting");
		for (student student : listofstudent) {
			System.out.println(student.id +"   "+student. name+"     "+student. adress);
			
		}
		
		Collections.sort(listofstudent);
		System.out.println("After sorting");
		for (student student : listofstudent) {
			System.out.println(student.toString());
			
		}
	}

}
