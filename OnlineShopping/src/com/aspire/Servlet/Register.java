package com.aspire.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aspire.onlineshoppingBean.UserBean;

import com.aspire.onlinshoppingBO.UserBO;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		UserBean userBean=new UserBean();
		userBean.setFirstname(firstname);
		
		userBean.setLastname(lastname);
		userBean.setEmail(email);
		userBean.setPassword(password);
		PrintWriter out = response.getWriter();
		  
		UserBO userBO=new UserBO();
		if(userBO.registration(userBean)==true)
		{
			response.sendRedirect("Login.jsp");
		}
		else
		{
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('registration failed! try again');");
			   out.println("location='Register.jsp';");
			   out.println("</script>");
		}
		  
		
		  
	}


	}


