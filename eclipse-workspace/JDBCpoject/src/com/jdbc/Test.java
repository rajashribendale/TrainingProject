package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Test {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch24", "root", "root");
			String sql="insert into allstudent values(110,'unnati','JALGAON')";
			Statement smt=connection.createStatement();
			smt.execute(sql);
			connection.close();
			System.out.println("table created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
