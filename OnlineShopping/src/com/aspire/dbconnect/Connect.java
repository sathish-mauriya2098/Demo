package com.aspire.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static Connection getConnection() {
		 Connection connection = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_shopping","root","aspire@123");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return connection;
	 }
}
