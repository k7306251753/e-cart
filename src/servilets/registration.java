package servilets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.UserDto;

/**
 * Servlet implementation class serv1
 */
@javax.servlet.annotation.WebServlet("/registration")
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() {

	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//fname lname email pwd

		String name = request.getParameter("fname") + " " + request.getParameter("lname");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		UserDto Dto = new UserDto();
		Dto.setName(name);
		Dto.setEmail(email);
		Dto.setPwd(pwd);
		try {
			int sign = UserDao.adduser(Dto);
			if (sign > 0) {
				request.setAttribute("signup", sign);
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
