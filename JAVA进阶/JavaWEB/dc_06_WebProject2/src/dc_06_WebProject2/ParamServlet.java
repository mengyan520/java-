package dc_06_WebProject2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1277603692197965266L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码
		req.setCharacterEncoding("UTF-8");
		//获取参数
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(username+" "+password);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//利用post请求调用get方法
		doGet(req, resp);
	}

}
