package ClassmgmtJDBCProject.serviceimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Myconnection {
	private static Connection connection=null;
	private Myconnection() {
		
	}
	public static Connection getconnection() {
		try {
			if(connection == null){
			Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/jdbcproject", "root", "root");
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


