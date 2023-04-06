package servilets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.CartDto;
import dto.ProductDto;

/**
 * Servlet implementation class IncDesc
 */
@WebServlet("/inc-dec-qt")
public class IncDescServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IncDescServelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int product_id = Integer.parseInt(request.getParameter("id"));
		;// action=inc&id=5
		String action = request.getParameter("action");
		int index = 0;
		int price = 0;
		List<CartDto> plist = (List<CartDto>) request.getSession().getAttribute("plist");
		for (ProductDto dto : plist) {

			if (product_id == dto.getProduct_id()) {
				price = Integer.parseInt(dto.getPrice());
				break;
			}
		}

		List<CartDto> cvlist = (List<CartDto>) request.getSession().getAttribute("cvlist");
		CartDto newCartDto = new CartDto();
		if (action.equalsIgnoreCase("inc")) {
			for (CartDto dto : cvlist) {
				index = cvlist.indexOf(dto);
				if (product_id == dto.getProduct_id()) {
					newCartDto.setPquantity(dto.getPquantity() + 1);
					newCartDto.setProduct_name(dto.getProduct_name());
					int q = newCartDto.getPquantity();
					String total = Integer.toString(price * q);
					newCartDto.setPrice(total);
					break;
				}

			}

		} else {
			for (CartDto dto : cvlist) {
				if (product_id == dto.getProduct_id()) {

					dto.setPquantity(dto.getPquantity() - 1);

				}

			}

		}
		cvlist.remove(index);
		cvlist.add(index, newCartDto);
		request.getSession().setAttribute("cvlist", cvlist);
		response.sendRedirect("CartView.jsp");
	}
}
