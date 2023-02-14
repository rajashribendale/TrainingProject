package com.Exponent.classmgmtSyst.ServiceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.Exponent.classmgmtSyst.Model.Batch;
import com.Exponent.classmgmtSyst.Model.Course;
import com.Exponent.classmgmtSyst.Model.faculty;
import com.Exponent.classmgmtSyst.Model.student;
import com.Exponent.classmgmtSyst.Service.service;

public class serviceImpl implements service {
	List<Course> clist = new ArrayList<Course>();
	List<faculty> flist = new ArrayList<faculty>();
	List<Batch> blist = new ArrayList<Batch>();
	List<student> slist = new ArrayList<student>();

	@Override
	public void addCourse() {
		System.out.println("how many courses you want to add");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			Course c = new Course();
			System.out.println("Enetr course Id");
			c.setCid(sc.nextInt());

			System.out.println("Enter Course Name");
			c.setCname(sc.next());
			clist.add(c);
			System.out.println("Succefully added Course");
		}
	}

	@Override
	public void displayCourse() {
		for (Course course : clist) {
			System.out.println(course.toString());
		}
	}

	@Override
	public void removecourse() {
//		for (int i = 1; i <= clist.size(); i++) {
//		System.out.println(clist.remove(1));
		Scanner sc = new Scanner(System.in);
		System.out.println("select id .. u want to remove from list");
		int courseid = sc.nextInt();
		Iterator<Course> itr = clist.iterator();
		for (Course c : clist) {
			if(courseid==c.getCid()){
				clist.remove(c);
				c.setCid(courseid);
			} else {
				System.out.println("invllid Id..please enter again");
			}
			System.out.println("succefully removed  ");
	}
	}

	@Override
	public void addFaculty() {
		System.out.println("how many faculty u want to add");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			faculty f = new faculty();
			System.out.println("Enter faculty id");
			f.setFid(sc.nextInt());

			System.out.println("Enter Faculty Name");
			f.setFname(sc.next());

			System.out.println("Choose course u want to add");
			displayCourse();
			int id = sc.nextInt();

			for (Course course : clist) {
				if (id == course.getCid()) {
					f.setCourse(course);
				}
			}
			flist.add(f);
			System.out.println("faculty added successfully");
		}
	}

	@Override
	public void displayfaculty() {
		for (faculty f : flist) {
			System.out.println(f.toString());
		}
	}

	@Override
	public void addBatch() {
		System.out.println("how many batch you want to add");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			Batch b = new Batch();
			System.out.println("Enetr Batch Id");
			b.setBid(sc.nextInt());

			System.out.println("Enter batch Name");
			b.setBname(sc.next());
			blist.add(b);
			System.out.println("Succefully added batches");
		}
	}

	@Override
	public void displaybatch() {
		for (Batch batch : blist) {
			System.out.println(batch.toString());
		}
	}

	@Override
	public void addstudent() {
		System.out.println("how many student you want to add");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			student s = new student();
			System.out.println("Enter stu Id");
			s.setSid(sc.nextInt());

			System.out.println("Enter student Name");
			s.setSname(sc.next());
			slist.add(s);
			System.out.println("Succefully added students");

		}
	}

	@Override
	public void displaystudent() {
		for (student stu : slist) {
			System.out.println(stu.toString());
		}
	}

	@Override
	public void Removestudent() {
		System.out.println(slist.remove(1));
	}

}
