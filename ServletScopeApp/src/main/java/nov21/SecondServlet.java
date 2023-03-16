package nov21;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rdata=(String)request.getAttribute("req_data");
		HttpSession session = request.getSession(true);
		String sdata= (String)session.getAttribute("sess_data");
		ServletContext sc = getServletContext();
		String cdata=(String)sc.getAttribute("context_data");
		try(PrintWriter out = response.getWriter()){
			response.setContentType("text/html");
			out.print("<br>Request Object DAta : "+rdata);
			out.print("<br>Session Object DAta : "+sdata);
			out.print("<br>ServletContext Object DAta : "+cdata);
			
		}
	}

}
