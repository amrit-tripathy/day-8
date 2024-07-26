package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//here from application we are trying to establish connection with database so 
//Drivermanager sets the connection and fetches the Connection object 
//with the help of which we execute statements .
//to work with queries we need statements
//prepared statement====DML,INSERT,DELETE,UPDATE
//callable statement ===sql
public class DemoOnJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		String url ="jdbc:mysql://localhost:3306/graymatterdb";
		String username="root";
		String password="Amrit18#";
		
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("connection established");
		
		//dml queries  //below is code to retrieve output from a query
		Statement st = con.createStatement();
		String query="select first_name,employee_id from employees ";
		ResultSet rs =st.executeQuery(query);//resultset is a buffer which is iterable
		//resultset contains the output of query
		//with the help of rs we are iterating on all rows of output
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getInt(2));//rs.getString(1)is first_name and rs.getInt(2) is employee_id 
		}
		
		rs.close();
		st.close();
		con.close();
		
		
		//the below code is for inserting data in table 
		String query1 = "INSERT INTO regions(region_id,region_name) VALUES(?,?)";
		PreparedStatement ps = con.prepareStatement(query1);//
		ps.setInt(1, 5);// here we are inserting values in query for 1st field = region_id==5 
		ps.setString(2, "Antartica");//2nd field region_name=="Antartica"
		int row =ps.executeUpdate();
		System.out.println("row inserted: "+row);
		ps.close();
		con.close();
		
		
		
	}

}



