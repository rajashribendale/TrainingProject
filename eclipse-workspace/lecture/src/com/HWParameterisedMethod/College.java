package com.HWParameterisedMethod;


public class College {
	
		public void addStudentDetails() {
			
			
			student stu = new student();
			stu.id = 11;
			stu.name = "rajshri";
			stu.adress = "pune";
			
			University u = new University();
			
			u.displayStudent(stu);

			
		}

		public void AllStudentDetails() {
		
			AllStudent all = new AllStudent();
			all.s.id=12;
			all.s.name="Bhgau";
			all.s.adress="Nashik";
			
			all.s1.id=13;
			all.s1.name="uju";
			all.s1.adress="nagar";
			
			
			all.s2.id=14;
			all.s2.name="unnati";
			all.s2.adress="mumbai";
			
			University u = new University();
			u.displayAllstudent(all);
			
			
			
			
		}


	}



