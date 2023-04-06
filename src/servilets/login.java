package servilets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.UserDto;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDto Dto = null;
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		if (pwd.isEmpty() && email.isEmpty())
			pwd = "hkbdj";

		UserDao u = new UserDao();
		try {
			Dto = u.login(email);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name=Dto.getName();
		if (Dto.getPwd().equals(pwd)) {
			request.getSession().setAttribute("username",name);
			request.getRequestDispatcher("/ProductServ").forward(request, response);
		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
			
		}

	}
}
