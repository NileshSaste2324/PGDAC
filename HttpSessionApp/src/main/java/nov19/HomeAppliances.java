package nov19;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HomeAppliances")
public class HomeAppliances extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String itm1 =request.getParameter("item1");
		String itm2 =request.getParameter("item2");
		HttpSession session = request.getSession(false);
		if(itm1!=null) {
			session.setAttribute("fan", itm1);
		}
		if(itm2!=null) {
			session.setAttribute("ac", itm2);
		}
		try(PrintWriter out = response.getWriter()){
			out.print("<html>");
			out.print("<head>");
			out.print("<title>HomeAppliances</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<form action='Bill' >");
			out.print("<input type='checkbox' name='item1' value='iron' >IRON<br>");
			out.print("<input type='checkbox' name='item2' value='mixer' >MIXER<br>");
			out.print("<input type='submit' value='Bill' ><br>");
			out.print("</form>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
