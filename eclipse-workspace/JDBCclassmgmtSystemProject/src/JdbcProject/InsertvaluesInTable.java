package JdbcProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertvaluesInTable {
	public static void main(String[] args) {
		try {
			Connection conn = MyConnection.getconnection();
			String sql = "insert into  course values(?,?);";
			Scanner sc = new Scanner(System.in);
			System.out.println("enter Stu Id");
			int sid = sc.nextInt();
			System.out.println("Enetr Stu name");
			String sname = sc.next();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, sid);
			ps.setString(2, sname);
			System.out.println("value inserted");
			conn.close();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
