package com.student.packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) 
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "Sp940@*&");
			Statement st=con.createStatement();
			int i=st.executeUpdate("delete from employee1 where eid=1001");
			System.out.println(i+"Record Deleted successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}