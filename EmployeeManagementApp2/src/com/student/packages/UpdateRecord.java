package com.student.packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) 
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "Sp940@*&");
			Statement st=con.createStatement();
			int i=st.executeUpdate("update employee1 set ename='Pooja_updated',dept='CS', sal=25000.00 where eid=1002");
			System.out.println(i+"Record Updated successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}