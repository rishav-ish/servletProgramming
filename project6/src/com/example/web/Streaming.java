package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Streaming extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		
		OutputStream os = response.getOutputStream();
		
		os.write();          //need to learn a bit more about this things first...
		
		os.flush();
		os.close();
		
	}
	
}