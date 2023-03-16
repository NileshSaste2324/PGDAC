package nov19;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Electronic")
public class Electronic extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out= response.getWriter()){
			out.print("<html>");
			out.print("<head>");
			out.print("<title>Electronic</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<form action='Electric' >");
			out.print("<input type='checkbox' name='item1' value='pc' >PC<br>");
			out.print("<input type='checkbox' name='item2' value='mobile' >MOBILE<br>");
			out.print("<input type='submit' value='Next' ><br>");
			out.print("</form>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
