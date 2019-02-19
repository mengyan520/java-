package dan.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dan.domain.Product;
import dan.service.ProductService;

public class ProductListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 传递请求到service层
		ProductService service = new ProductService();
		List<Product> products = service.findAllProduct();
		if (products != null) {
			request.setAttribute("products", products);
			request.getRequestDispatcher("/product_list.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}