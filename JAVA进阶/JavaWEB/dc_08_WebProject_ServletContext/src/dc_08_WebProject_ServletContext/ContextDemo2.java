package dc_08_WebProject_ServletContext;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextDemo2 extends HttpServlet {
	public void init() throws ServletException {
		// 在Seveltcontext域中存一个数据count
		int count = 0;
		this.getServletContext().setAttribute("count", count);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletContext = this.getServletContext();
		// 获取数据
		Object object = servletContext.getAttribute("name");
		System.out.println(object);
		//计算访问几次
		//从servletcontext中取出count进行++运算
		ServletContext context = this.getServletContext();
		Integer count = (Integer) context.getAttribute("count");
		count++;
		//用户登录成功
		response.getWriter().write("---you are success login person:"+count);
		context.setAttribute("count", count);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}