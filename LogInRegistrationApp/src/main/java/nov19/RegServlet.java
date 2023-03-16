package nov19;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String unm= request.getParameter("uname");
		String pass= request.getParameter("upass");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Webjava","root","Nilesh@2324");
			System.out.println("Connection Estblished");
			PreparedStatement s = con.prepareStatement("insert into user values(?,?)" );
			s.setString(1, unm);
			s.setString(2, pass);
			int i = s.executeUpdate();
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		
		response.sendRedirect("login_form.html");
		
	}

}
