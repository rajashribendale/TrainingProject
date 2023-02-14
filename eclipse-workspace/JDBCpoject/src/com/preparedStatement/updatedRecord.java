package com.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.designPatternSingleTon.MyConnection;

public class updatedRecord {
	public static void main(String[] args) {
	try {
//			Class.forName("com.mysql.jdbc.Driver");
//
//			Connection connection = DriverManager.getConnection
//					("jdbc:mysql://localhost:3306/batch24", "root", "root");
		Connection connection=MyConnection.getconnection();
			String sql="update allstudent set name=? where id=?";
			Scanner sc=new Scanner(System.in);
			System.out.println("enter new name ");
			String name=sc.next();
			
			System.out.println("enter id id");
			int id=sc.nextInt();
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, id);
			int count=ps.executeUpdate();
			System.out.println("count" +count);
			connection.close();
			sc.close();
		} catch (Exception e) {
e.printStackTrace();		}
	}

}
