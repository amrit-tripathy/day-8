package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSourceClass {
	//if you want to establish connection you need connection object for that u need Drivermanager.getConnection(url,root,password)
	//con object is used to execute query and update query also ,so very important
public Connection getConnection() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/graymatterdb",
				"root","Amrit18#");
		return con;
	}

}
