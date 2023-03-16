package nov19;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Electric")
public class Electric extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String itm1 =request.getParameter("item1");
		String itm2 =request.getParameter("item2");
		if(itm1!=null) {
			Cookie cookie = new Cookie("pc",itm1);
			response.addCookie(cookie);
		}
		if(itm2!=null) {
			Cookie cookie = new Cookie("mobile",itm2);
			response.addCookie(cookie);
		}
		try(PrintWriter out = response.getWriter()){
			out.print("<html>");
			out.print("<head>");
			out.print("<title>Electric</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<form action='HomeAppliances' >");
			out.print("<input type='checkbox' name='item1' value='fan' >FAN<br>");
			out.print("<input type='checkbox' name='item2' value='ac' >AC<br>");
			out.print("<input type='submit' value='Next' ><br>");
			out.print("</form>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
