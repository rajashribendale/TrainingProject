package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectRecord {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch24", "root", "root");
		String sql="select * from allstudent";
		
Statement smt=connection.createStatement();
ResultSet rs=smt.executeQuery(sql);
while(rs.next()) {
	System.out.println(rs.getInt("id"));
	System.out.println(rs.getString("name"));
	
}
connection.close();
	} catch (Exception e) {
e.printStackTrace();	}
}
}
