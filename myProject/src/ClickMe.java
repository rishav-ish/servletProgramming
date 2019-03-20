package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ClickMe extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		

		     PrintWriter out = response.getWriter();

		     out.println("Hii how are you<br>");
	}
}