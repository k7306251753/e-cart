package servilets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.CartDto;
import dto.ProductDto;

@WebServlet("/CartView")
public class CartViewservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CartViewservelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		double total = 0;

		List<CartDto> cList = (List<CartDto>) request.getSession().getAttribute("cart_list");
		List<ProductDto> pList = (List<ProductDto>) request.getSession().getAttribute("plist");

		for (CartDto dto : cList) {
			for (ProductDto pdto : pList) {

				if (dto.getProduct_id() == pdto.getProduct_id()) {

					//dto.setProduct_id(pdto.getProduct_id());
					dto.setProduct_name(pdto.getProduct_name());
					dto.setPrice(pdto.getPrice());
					//dto.setPquantity(1);

				}

			}

		}
		for (CartDto dto1 : cList) {

			total = total + Integer.parseInt(dto1.getPrice());
			request.getSession().setAttribute("total", total);

		}

		request.getSession().setAttribute("cvlist", cList);
		response.sendRedirect("CartView.jsp");

	}

}
