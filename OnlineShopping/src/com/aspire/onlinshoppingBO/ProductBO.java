package com.aspire.onlinshoppingBO;

import com.aspire.onlineshoppingBean.ProductBean;

import com.aspire.onlineshoppingDAO.ProductDAO;


public class ProductBO {
	
	public boolean addProducts(ProductBean productBean)
	{
		
		ProductDAO productDAO=new ProductDAO();
		productDAO.addProducts( productBean);
		if(productDAO.addProducts(productBean)==true)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
