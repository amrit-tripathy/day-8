package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_demo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/graymatterdb";
		String username="root";
		String password ="Amrit18#";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		String query = "update regions set region_name=? where region_id=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,"maaaal");
		ps.setInt(2, 5);
		ps.executeUpdate();
		System.out.println("boom success");
		
		String query1 = "select * from regions";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query1);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		
		st.close();
		rs.close();
		ps.close();
		con.close();
		
		
		
		
	}

}
