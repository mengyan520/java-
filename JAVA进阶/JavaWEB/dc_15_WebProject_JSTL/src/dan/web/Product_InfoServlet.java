package dan.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dan.domain.Product;
import dan.service.Product_InfoService;

public class Product_InfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取商品id
		String pid = request.getParameter("pid");
		System.out.println(pid);
		Product_InfoService service = new Product_InfoService();
		Product product =  service.findProductInfo(pid);
		System.out.println(product.toString());
		request.setAttribute("product_info", product);
		request.getRequestDispatcher("/product_info.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}