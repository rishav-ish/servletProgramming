import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorld extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		     
			  PrintWriter out = response.getWriter();

			  out.println("<!DOCTYPE html>" +
				      "<html>" + 
				      "<head>" +
			              "<title>Hello world</title>" +
				      "</head>" +
				      "<body>" +
					  "<h1><center>Hello World</center></h1>" +
				      "</body>" +
				      "</html>"
				     );
	}
}