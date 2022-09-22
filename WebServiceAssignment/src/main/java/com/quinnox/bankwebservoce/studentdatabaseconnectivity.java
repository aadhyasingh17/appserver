package com.quinnox.bankwebservoce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class studentdatabaseconnectivity 
{
	public static final String URL = "database.cz6tfgwffje5.ap-south-1.rds.amazonaws.com";
	public static final String user = "admin";
	public static final String password = "Aadhya17";
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException  
	{
		System.out.println("Connecting to  Database...");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, user,password);
		
		if(con.isValid(3))
		{
			System.out.println("Connected to Database.");
		}
		
		return con;
		
	}
}

