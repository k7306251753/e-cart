package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {

	public static Connection getConnection() {

		Connection conn = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			 try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		} 
		return conn;
	}
}
