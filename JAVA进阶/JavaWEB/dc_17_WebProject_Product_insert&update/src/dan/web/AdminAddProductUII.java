
package dan.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dan.domain.Category;
import dan.service.AdminAddProductUIService;

public class AdminAddProductUII extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminAddProductUIService service = new AdminAddProductUIService();
		List<Category> categorys = service.findAllCategory();
		if (categorys != null) {
			request.setAttribute("categorys", categorys);
			request.getRequestDispatcher("/admin/product/add.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}