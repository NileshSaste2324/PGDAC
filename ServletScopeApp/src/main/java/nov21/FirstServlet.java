package nov21;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("req_data", "Data in Request Object");
		HttpSession session= request.getSession(true);
		session.setAttribute("sess_data", "Data in Request Object");
		ServletContext sc = getServletContext();
		sc.setAttribute("context_data", "Data in ServletContext object ");
//		RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
//		rd.forward(request, response);
		response.sendRedirect("SecondServlet");
	}

}
