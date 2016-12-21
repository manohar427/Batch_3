package com.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB_ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     getConnection();
	}

	//DB connection
	public static  void getConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/repairman","root","Tester@123");
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from customerinfo");
		
		while(rs.next()){
			System.out.println("Address_id:"+rs.getString("address_id") + ","+"address_line1:"+rs.getString("address_line1")+ ","+"State:"+rs.getString("state"));
			
		}
		con.close();
	}
}
