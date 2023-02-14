package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updateTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch24", "root", "root");

			String sql = "update allstudent set name='A' where id=101";
			Statement smt = connection.createStatement();
			smt.execute(sql);
			connection.close();
			System.out.println("update record");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
