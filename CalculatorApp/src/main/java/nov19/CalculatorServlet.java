package nov19;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		double n1 = Double.parseDouble(request.getParameter("txtN1"));
		double n2 = Double.parseDouble(request.getParameter("txtN2"));
		double result =0;
		String opr=request.getParameter("opr");
		if(opr.equals("+")) {
			result=n1+n2;
			out.println("<h1> Result = "+result);
		}
		if(opr.equals("*")) {
			result=n1*n2;
			out.println("<h1> Result = "+result);
		}
		if(opr.equals("-")) {
			result=n1-n2;
			out.println("<h1> Result = "+result);
		}
		if(opr.equals("/")) {
			result=n1/n2;
			out.println("<h1> Result = "+result);
		}
	}
}
