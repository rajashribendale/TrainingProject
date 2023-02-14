package com.AgrigationSettergetter;

public class StudentDetails {

	public static void main(String[] args) {
		

		Course c = new Course();
		c.setCid(14);
		c.setCname("D");

		Faculty f = new Faculty();
		f.setFid(13);
		f.setFname("C");
		f.setCourse(c);

		Batch b = new Batch();
		b.setBid(12);
		b.setBname("B");
		b.setFaculty(f);

		Student s = new Student();
		s.setSid(11);
		s.setSname("A");
		s.setBatch(b);

		System.out.println("stu.id " + s.getSid());
		System.out.println("stu name:" + s.getSname());
		System.out.println("Batch " + s.getBatch().getBid());
		System.out.println("batch name:" + s.getBatch().getBname());
		System.out.println("Faculty id:" + s.getBatch().getFaculty().getFid());
		System.out.println("Faculty name:" + s.getBatch().getFaculty().getFname());
		System.out.println("Course:" + s.getBatch().getFaculty().getCourse().getCid());
		System.out.println("Course name:" + s.getBatch().getFaculty().getCourse().getCname());

	}

}
