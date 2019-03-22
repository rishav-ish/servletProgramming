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
			 
			 String user = request.getHeader("User-Agent");
			 String host = request.getHeader("Host");
			 String language = request.getHeader("Accept-Language");
			 String accept = request.getHeader("Accept");
			 String encoding = request.getHeader("Accept-Encoding");
			 String charset = request.getHeader("Accept-Charset");
			 String alive = request.getHeader("Keep-Alive");

		     MySecret ms = new MySecret();
			 
			 out.println(ms.amIYourLove(c));
			 
			 // String secret = ms.amIYourLove(c);
			 
			 // request.setAttribute("styles",secret);
			 
			 // RequestDispatcher view = request.getRequestDispatcher("secret.jsp");
			 
			 // view.forward(request,response);
			 
			 out.println("<br><br>some Information about your header packet ...<br>");
			 
			 out.println("<br>UserAgent : " + user);
			 out.println("<br>Host : " + host);
			 out.println("<br>Accept-Language : " + language);
			 out.println("<br>Accept : " + accept);
			 out.println("<br>Accept-Encoding : " + encoding);
			 out.println("<br>Accept-Charset : " + charset);
			 out.println("<br>Keep-Alive : " + alive);
			 
			 
			 //adding some inforamtion about port...
			 
			 int remotePort = request.getRemotePort();
			 int serverPort = request.getServerPort();
			 int localPort = request.getLocalPort();
			 
			 
			 out.println("<br><br>Some inforamtion about ports....<br>");
			 out.println("<br>Remote Port : " + remotePort);
			 out.println("<br>Server Port : " + serverPort);
			 out.println("<br>Local Port : " + localPort);
			 
	}
}