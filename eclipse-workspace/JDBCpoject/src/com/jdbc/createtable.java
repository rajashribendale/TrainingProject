package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.designPatternSingleTon.MyConnection;


public class createtable {
	public static void main(String[] args) {
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection connection = DriverManager.getConnection
//					("jdbc:mysql://localhost:3306/batch24", "root", "root");
			Connection connection=MyConnection.getconnection();
			String sql="create table employee(eid int,ename varchar(200));";
			Statement smt=connection.createStatement();
			smt.execute(sql);
			connection.close();
			System.out.println("table created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


