package JdbcProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class createTable {
	public static void main(String[] args) {
		try {
			Connection conn = MyConnection.getconnection();
			String sql = "create table course (cid int,cname varchar(200));";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.executeUpdate();
			System.out.println("table created");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
