package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Email extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException {
		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();


		out.println(getServletConfig().getInitParameter("adminEmail"));
	}
}