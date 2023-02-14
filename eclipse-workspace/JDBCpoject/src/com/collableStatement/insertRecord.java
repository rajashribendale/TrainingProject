package com.collableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.designPatternSingleTon.MyConnection;

public class insertRecord {
public static void main(String[] args) {
	try {
		Connection conn=MyConnection.getconnection();
		CallableStatement sc=conn.prepareCall("{call insertemployee1(?,?)}");
		sc.setInt(1, 102);
		sc.setString(2, "A");
		sc.execute();
		System.out.println("record inserted");
		
	} catch (Exception e) {
e.printStackTrace();	}
}
}
