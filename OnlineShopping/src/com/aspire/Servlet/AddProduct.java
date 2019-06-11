package com.aspire.Servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.aspire.onlineshoppingBean.ProductBean;
import com.aspire.onlineshoppingDAO.ProductDAO;
import com.aspire.onlinshoppingBO.ProductBO;



/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
@MultipartConfig(fileSizeThreshold=1024*1024*10, 	// 10 MB 
maxFileSize=1024*1024*50,      	// 50 MB
maxRequestSize=1024*1024*100) 
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
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
		 PrintWriter out = response.getWriter(); 
         
         String productName=request.getParameter("productName");
       
         String cost=(request.getParameter("cost"));
        String quantity=(request.getParameter("quantity"));
         InputStream inputstream=null;
         Part filePart=request.getPart("file");
         if(filePart!=null)
         {
        	 inputstream=filePart.getInputStream();
         }
        ProductBean productBean=new ProductBean();
        productBean.setProductName(productName);
        productBean.setCost(cost);
        productBean.setQuantity(quantity);
        productBean.setInputstream(inputstream);
        ProductBO productBO=new ProductBO();
        productBO.addProducts(productBean);
        if(productBO.addProducts(productBean)==(true))
        {
        	out.print("success");
        }
        else
        {
        	out.print("failed");
        }
	}
	}


