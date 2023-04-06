package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import dbconnection.Dbconnection;
import dto.UserDto;

public class UserDao {
	// name email pwd
	public static int adduser(UserDto dto) throws SQLException {
		Connection conn = Dbconnection.getConnection();
		PreparedStatement ps;

		ps = conn.prepareStatement("INSERT INTO user (Name, Email, pwd) VALUES (?,?,?);");
		ps.setString(1, dto.getName());
		ps.setString(2, dto.getEmail());
		ps.setString(3, dto.getPwd());

		int k = ps.executeUpdate();

		return k;
	}

	public UserDto login(String email) throws SQLException {
		Connection conn = Dbconnection.getConnection();
		Statement ps;
		UserDto dto= null;
		ps = conn.createStatement();
		ResultSet rs = ps.executeQuery("SELECT * FROM user where email= " + "'" + email + "'");

		while (rs.next()) {// user_id, name, email, pwd

			
	
			
		dto= new UserDto(rs.getInt("user_id"),rs.getString("name"),rs.getString("email"),rs.getString("pwd"));

			
		}
		
		return dto;
		
		
	}

}