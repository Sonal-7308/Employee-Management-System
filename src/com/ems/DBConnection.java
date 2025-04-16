package com.ems;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	
	static Connection con;
	public static Connection createDBConnection() {
		
		
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			//get connection
			String url="jdbc:mysql://localhost:3306/employeeDB?useSSL=false";
			String username = "root";
			String password = "Sonal@991";
			 con = DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
		   e.printStackTrace();
		}
		return con;
	}

}
