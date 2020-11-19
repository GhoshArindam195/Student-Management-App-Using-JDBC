package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class StudentDao 
{
	//Insering student into DB
	public static boolean insertStudentToDB(Student st)
	{
		boolean f=false;
		try
		{
			//JDBC code...
			Connection con= CP.createC();
			String quary="insert into students(sname,sphone,scity) values(?,?,?)";
			
			//PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(quary);
			
			//set the value of parameters
			pstmt.setString(1,st.getStudentName());
			pstmt.setString(2,st.getStudentPhone());
			pstmt.setString(3,st.getStudentCity());
			
			//Execute
			pstmt.executeUpdate();
			f=true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return f;
		}
		return f;
	}
	
	//Deleting student from DB
	public static boolean deleteStudentToDB(int userId)
	{
		boolean f=false;
		try
		{
			//JDBC code...
			Connection con= CP.createC();
			String quary="delete from students where sid=?";
			
			//PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(quary);
			
			//set the value of parameters
			pstmt.setInt(1, userId);
			
			//Execute
			pstmt.executeUpdate();
			f=true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return f;
		}
		return f;
	}

	//Show the students Table
	public static void showStudentToDB() 
	{
		boolean f=false;
		try
		{
			//JDBC code...
			Connection con= CP.createC();
			String quary="select * from students";
			Statement stmt= con.createStatement();
			
			//Execute
			ResultSet set = stmt.executeQuery(quary);
		
			//Fetching & Displaying data
			while(set.next())
			{
				//Fetching
				int id=set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");
				
				//Displaying
				System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Phone: "+phone);
				System.out.println("City: "+city);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	//Update
	public static boolean updateStudentToDB(int sid, int option, String val) 
	{
		boolean f=false;
		if(option==1)
		{
			try
			{
				//JDBC code...
				Connection con= CP.createC();
				String quary="update students set sname=? where sid=?";
				
				//PreparedStatement
				PreparedStatement pstmt = con.prepareStatement(quary);
				
				//set the value of parameters
				pstmt.setString(1, val);
				pstmt.setInt(2, sid);
				
				
				//Execute
				pstmt.executeUpdate();
				f=true;
			}
			catch (Exception e) 
			{
				e.printStackTrace();
				return f;
			}
		}
		
		if(option==2)
		{
			try
			{
				//JDBC code...
				Connection con= CP.createC();
				String quary="update students set sphone=? where sid=?";
				
				//PreparedStatement
				PreparedStatement pstmt = con.prepareStatement(quary);
				
				//set the value of parameters
				pstmt.setString(1, val);
				pstmt.setInt(2, sid);
				
				
				//Execute
				pstmt.executeUpdate();
				f=true;
			}
			catch (Exception e) 
			{
				e.printStackTrace();
				return f;
			}
		}
		
		if(option==3)
		{
			try
			{
				//JDBC code...
				Connection con= CP.createC();
				String quary="update students set scity=? where sid=?";
				
				//PreparedStatement
				PreparedStatement pstmt = con.prepareStatement(quary);
				
				//set the value of parameters
				pstmt.setString(1, val);
				pstmt.setInt(2, sid);
				
				
				//Execute
				pstmt.executeUpdate();
				f=true;
			}
			catch (Exception e) 
			{
				e.printStackTrace();
				return f;
			}
		}
		
		
		return f;
	}

}
