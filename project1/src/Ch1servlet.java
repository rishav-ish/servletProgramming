import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class Ch1servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		PrintWriter out = response.getWriter();

		Date today = new Date();


		out.println("<html>" +
			    "<body>" + 
			    "<h1 align = center>HT\'s Chapter1 Servlet</h1>" +
			    "<br>" + today + "</body>" + "</html>"
			   );
	}
}