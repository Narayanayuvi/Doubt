 package com.telusko.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DontNo
 */

public class DontNo extends HttpServlet   
{
	

	protected void dopost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name = request.getParameter("name").trim();
		response.setContentType("text/html"); 
    	        PrintWriter out = response.getWriter(); 
    	        out.print("<h2>Hello "+name+ "</h2>"); 
    	        out.close();
	}
}

