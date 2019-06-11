package com.aspire.onlineshoppingDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.aspire.dbconnect.Connect;
import com.aspire.onlineshoppingBean.UserBean;

public class UserDAO {
	public String loginCheck(UserBean userBean)
	{
		Statement statement=null;
		ResultSet resultSet = null;
		
		String username=userBean.getFirstname();
		String password=userBean.getPassword();
		try {
			Connection connection=Connect.getConnection();
			statement = connection.createStatement();
		   resultSet = statement.executeQuery("select * from user");
		   while(resultSet.next())
		   {
		  
		   if(username.equals(resultSet.getString(1)) && password.equals(resultSet.getString(4)))
		   {
			  String user=resultSet.getString(1);
			  return user;
		   }
		  
		   }
		 
		   
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}
	
	public boolean register(UserBean userBean)
	{
		
		try {
			Connection connection=Connect.getConnection();
			String firstname=userBean.getFirstname();
			String lastname=userBean.getLastname();
			String email=userBean.getEmail();
			String password=userBean.getPassword();
			PreparedStatement preparedstatement=connection.prepareStatement("insert into user values(?,?,?,?)");  
	         preparedstatement.setString(1,firstname);  
	         preparedstatement.setString(2,lastname);  
	         preparedstatement.setString(3,email);  
	         preparedstatement.setString(4,password);  
	         int update = preparedstatement.executeUpdate();  
	         if(update>0)  
	         {
	         return true;
	         }
		    }
			catch (Exception ex) 
	        {
	             ex.printStackTrace();
	        } 
			return false;
	}

}
