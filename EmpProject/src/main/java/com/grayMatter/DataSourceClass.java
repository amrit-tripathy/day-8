package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSourceClass {//this class is made in that getConnection method 
	//is created so that we can ensure that our web app is connected to sql server
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/graymatterdb",
				"root","Amrit18#");
		return con;
	}

}
