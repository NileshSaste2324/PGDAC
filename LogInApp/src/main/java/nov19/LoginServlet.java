package nov19;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String unm = request.getParameter("uname");
		String upass = request.getParameter("upass");
		
		if(unm.equals("Nilesh") && upass.equals("ns2324")) {
			response.sendRedirect("HomeServlet");
		}else {
			response.sendRedirect("log_in.html");
		}
	}

}
