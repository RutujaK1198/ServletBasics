package com.udemy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("number1")!=null && request.getParameter("number2")!=null)
     {
			String num1 = request.getParameter("number1");
			// Long num1 = Long.parseLong(request.getParameter("number1"));
			 Long num2 = Long.parseLong(request.getParameter("number2"));  //can changed to a long, then need to typecast
			 
			 PrintWriter out = response.getWriter();
			 System.out.println("the sum of two number is "+ (num1+num2));
     }
    
	}

}
