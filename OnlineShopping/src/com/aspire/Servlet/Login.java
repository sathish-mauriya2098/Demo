package com.aspire.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aspire.onlineshoppingBean.UserBean;
import com.aspire.onlinshoppingBO.UserBO;


/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		UserBean userBean=new UserBean();
		userBean.setFirstname(username);
		userBean.setPassword(password);
		PrintWriter out = response.getWriter();
		UserBO userBO=new UserBO();
		if(username.equals("Admin")&& password.equals("Admin@123"))
		{
			response.sendRedirect("Admin.jsp");
		}
		if(userBO.loginValidation(userBean)==true)
		{
			out.print("Welcome, "+username);  
	        HttpSession session=request.getSession();  
	        session.setAttribute("name",username); 
	        response.sendRedirect("Products.jsp");
		}
		else
		{
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('User or password incorrect');");
			   out.println("location='Login.jsp';");
			   out.println("</script>");
		}
		  
		
	}
	}

