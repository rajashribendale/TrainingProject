package AggregationParameterCons;

import java.net.MulticastSocket;

public class StudentDetails {
	public static void main(String[] args) {
		Course c = new Course(111, "JavaProgramming");
		Course c1=new Course(101,"python");
		Course c2=new Course(11,"Abc","Pune");

		Faculty f = new Faculty(112, "nilesh sir ", c);
		Faculty f1=new Faculty(2, "Ajay sir", c1);

		Batch b = new Batch(113, "Batch24", f);

		Student s = new Student(114, "Rajshri", b);
		Student s2=new Student(4,"g", b);
		

		System.out.println(s.batch.faculty.course.cid + "  " + s.batch.faculty.course.cname);
		System.out.println(s.batch.faculty.fid + "  " + "faculty name"   +s.batch.faculty.fname);
		System.out.println(s.batch.bid + "  " + s.batch.bname);
		System.out.println(s.sid + "  " + s.sname);
		System.out.println(s2.sid+"   "+s2.sname);
		
	}

}
