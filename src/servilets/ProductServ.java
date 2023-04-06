package servilets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.ProductDao;

@WebServlet("/ProductServ")
public class ProductServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProductServ() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List productList=ProductDao.getallproducts();
		
		request.setAttribute("plist", productList);
		request.getSession().setAttribute("plist", productList);
		request.getRequestDispatcher("homepage.jsp").forward(request, response);

	}

}
