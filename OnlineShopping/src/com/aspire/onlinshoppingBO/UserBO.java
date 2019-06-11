package com.aspire.onlinshoppingBO;

import com.aspire.onlineshoppingBean.UserBean;
import com.aspire.onlineshoppingDAO.UserDAO;

public class UserBO {
public boolean loginValidation(UserBean userBean)
{
	
	UserDAO userDAO=new UserDAO();
	userDAO.loginCheck( userBean);
	if(userDAO.loginCheck(userBean)!=null)
	{
		return true;
	}
	else
	{
		return false;
	}
	
	
}
public boolean registration(UserBean userBean)
{
	
	UserDAO userDAO=new UserDAO();
	userDAO.register(userBean);
	if(userDAO.register(userBean)==true)
	{
		return true;
	}
	else
	{
		return false;
	}
	
	
}
}
