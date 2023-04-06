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

@WebServlet("/add-to-cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean ifproductExists = false;
		int product_id = Integer.parseInt(request.getParameter("id"));
		List<CartDto> oldCartList = (List<CartDto>) request.getSession().getAttribute("cart_list");
		List<CartDto> newCartList = new ArrayList();
		CartDto cartDto = new CartDto();
		cartDto.setProduct_id(product_id);
		cartDto.setPquantity(1);

		if (oldCartList == null) {

			newCartList.add(cartDto);
			request.getSession().setAttribute("cart_list", newCartList);
			response.sendRedirect("ProductServ");

		} else {
			newCartList = oldCartList;

			for (CartDto dto : newCartList) {

				if (dto.getProduct_id() == product_id) {

					ifproductExists = true;

				}

			}
			if (ifproductExists) {
				
				response.sendRedirect("productsdoubleentry.jsp");


			} else {

				newCartList.add(cartDto);
				request.getSession().setAttribute("cart_list", newCartList);
				                                                  
				response.sendRedirect("ProductServ");

			}

		}
		
	}
	
}
