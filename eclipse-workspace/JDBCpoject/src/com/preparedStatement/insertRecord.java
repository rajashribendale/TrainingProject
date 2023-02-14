package com.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insertRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/batch24", "root", "root");
			String sql = "insert into allstudent values(?,?,?)";
			Scanner sc = new Scanner(System.in);
			System.out.println("enter stu id");
			int id = sc.nextInt();
			System.out.println("enter stu name");
			String name = sc.next();
			System.out.println("enter course");
			String adress = sc.next();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, adress);
			ps.executeUpdate();
			System.out.println("Record inserted");
			connection.close();
			sc.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
