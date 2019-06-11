package com.aspire.onlineshoppingDAO;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;


import com.aspire.dbconnect.Connect;
import com.aspire.onlineshoppingBean.ProductBean;


public class ProductDAO {
	public boolean addProducts(ProductBean productBean)
	{
		 try
	 		{
			 Connection connection=Connect.getConnection();
				
				PreparedStatement preparedstatement=connection.prepareStatement("insert into product values(?,?,?,?)");  
	        
	          preparedstatement.setString(1,productBean.getProductName()); 
	          preparedstatement.setString(2,productBean.getCost()); 
	          preparedstatement.setString(3,productBean.getQuantity());
	     InputStream inputstream=productBean.getInputstream();
	          if(inputstream!=null)
	          {
	        	  preparedstatement.setBlob(4,inputstream);
	          }
	          int i = preparedstatement.executeUpdate();  
	          if(i>0) 
	          {
	           return true;
	          }
	 		}
	         catch(Exception e)
	         {
	        	 e.printStackTrace();
	         }
		 return false;
	}

}
