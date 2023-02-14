package ClassmgmtJDBCProject.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.Scanner;

import ClassmgmtJDBCProject.model.batch;
import ClassmgmtJDBCProject.model.course;
import ClassmgmtJDBCProject.model.faculty;
import ClassmgmtJDBCProject.model.student;
import ClassmgmtJDBCProject.service.service;

public class serviceimpl implements service {

	@Override
	public void addCourse() {
		System.out.println("how many courses u want to add");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Connection connection = Myconnection.getconnection();
		String sql = "insert into course values(?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			for (int i = 0; i <= n; i++) {
				course c = new course();
				System.out.println("enetr course id");
				int cid = sc.nextInt();
				ps.setInt(1, cid);

				System.out.println("enter course name");
				String cname = sc.next();
				ps.setString(2, cname);

				ps.execute();
				System.out.println("course added");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayCourse() {
		Connection connection = Myconnection.getconnection();
		String sql = "select * from Course;";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void addFaculty() {
		System.out.println("how many faculties u want to add");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Connection connection = Myconnection.getconnection();
		String sql = "insert into faculty values(?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			for (int i = 1; i <= n; i++) {
				faculty f = new faculty();
				System.out.println("enetr faculty id");
				int fid = sc.nextInt();
				ps.setInt(1, fid);

				System.out.println("enter faculty name");
				String fname = sc.next();
				ps.setString(2, fname);

				
				displayCourse();
				System.out.println("which course u want to add");
				int cid=sc.nextInt();
				ps.setInt(3, cid);
				ps.execute();
				System.out.println("faculty details added");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void displayfaculty() {
		Connection connection = Myconnection.getconnection();
		String sql = "select faculty.fid,faculty.fname,course.cid,course.cname from "
				+ "faculty inner join course on faculty.cid=course.cid";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addBatch() {
		System.out.println("how many batches u want to add");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Connection connection = Myconnection.getconnection();
		String sql = "insert into batch values(?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			for (int i = 1; i <= n; i++) {
				batch b = new batch();
				System.out.println("enter batch id");
				int bid = sc.nextInt();
				ps.setInt(1, bid);

				System.out.println("enter batch name");
				String bname = sc.next();
				ps.setString(2, bname);

				
				displayfaculty();
				System.out.println("which faculty u want to add");
				int fid=sc.nextInt();
				ps.setInt(3, fid);
				ps.execute();
				System.out.println("batch details added");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	

	@Override
	public void displaybatch() {
		Connection connection = Myconnection.getconnection();
		String sql = "select batch.bid,batch.bname,batch.bid,faculty.fname from "
				+ "batch inner join faculty on batch.bid=faculty.fid";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getString(4));
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void addstudent() {
		System.out.println("how many students u want to add");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Connection connection = Myconnection.getconnection();
		String sql = "insert into student values(?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			for (int i = 1; i <= n; i++) {
				student s = new student();
				System.out.println("enter stu id");
				int sid = sc.nextInt();
				ps.setInt(1, sid);

				System.out.println("enter stu name");
				String sname = sc.next();
				ps.setString(2, sname);

				
				displaybatch();
				System.out.println("which batch u want to add");
				int bid=sc.nextInt();
				ps.setInt(3, bid);
				ps.execute();
				System.out.println("student details added");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	

	@Override
	public void displaystudent() {
		Connection connection = Myconnection.getconnection();
		//we can use this query to see all data 
		//otherwisae we use same qury like batch
		String sql = "select course.cid,course.cname,faculty.fname ,batch.bid, batch.bname,student.sname from student inner join batch on student.bid=batch.bid inner join faculty on faculty.fid=batch.fid inner join course on course.cid=faculty.cid";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	}
