package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig sc= getServletConfig();
		String driverName= sc.getInitParameter("driver_class");
		ServletContext cntx= getServletContext();
		String dname = cntx.getInitParameter("drv_class");
		try(PrintWriter out = response.getWriter();){
			response.setContentType("text/html");
			out.print(driverName);
			out.print(dname);
		}
	}

}
