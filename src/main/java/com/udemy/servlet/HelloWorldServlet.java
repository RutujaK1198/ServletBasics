package com.udemy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

//@WebServlet(urlPatterns="/hello")  //either use this or configure in web.xml
public class HelloWorldServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	//there was arg1 & arg2, I changed to request and response
	{
		response.setContentType("text/html");
		//response.getWriter(); +cntrl 1 to assign to local variable. will give printwriter
		
		PrintWriter out = response.getWriter();
		out.println();  //whatever we write here go backs to web browser
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hellow Servlet World </h1>");
		out.println("</body>");
		out.println("</html>");
		
		// Should have to configure this in web.xml to run on a server
	}

}
