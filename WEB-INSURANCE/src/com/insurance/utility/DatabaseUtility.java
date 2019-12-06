package com.insurance.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtility {
	
	static String dbuser = "root";
	static String dbpassword = "";
	static String dbdriver = "com.mysql.jdbc.Driver";
	static String dburl = "jdbc:mysql://localhost:3306/insurance";
	
	public DatabaseUtility() {
		try
		{
			Class.forName(dbdriver);
		}catch(Exception e)
		{
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	public static Connection getDbConnection() throws SQLException
	{
		new DatabaseUtility();
		Connection con=DriverManager.getConnection(dburl, dbuser, dbpassword);
		return con;
			
	}

}
