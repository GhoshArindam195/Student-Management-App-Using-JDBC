package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP 
{
	private static Connection con;
	public static Connection createC()
	{
		try 
		{
			//Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create the connection
			String user="root";
			String password="arindam";
			String url="jdbc:mysql://localhost:3306/student_manage";
			
			con = DriverManager.getConnection(url, user, password);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return con;
	}

}
