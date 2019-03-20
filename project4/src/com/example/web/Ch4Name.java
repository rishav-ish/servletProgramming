package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Ch4Name extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException {
			
		     response.setContentType("text/html");

		     PrintWriter out = response.getWriter();

		     String c = request.getParameter("name");

		     MySecret ms = new MySecret();
			 
			 out.println(ms.amIYourLove(c));
	}
}