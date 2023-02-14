package com.designPatternSingleTon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	private static Connection connection=null;
	private MyConnection() {
		
	}
	public static Connection getconnection() {
		try {
			if(connection == null){
			Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/batch24", "root", "root");
			return connection;
			}
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
		
		
	}
	

}
