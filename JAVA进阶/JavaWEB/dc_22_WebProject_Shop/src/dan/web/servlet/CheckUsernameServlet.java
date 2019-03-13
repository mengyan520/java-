package dan.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dan.service.UserService;

public class CheckUsernameServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 获取验证码
		String code = request.getParameter("checkCode");
		if (code != null) {
			boolean isExist = code == request.getSession().getAttribute("check_code");
			String json = "{\"isExist\":" + isExist + "}";
			response.getWriter().write(json);
			return;
		}
		// 获得用户名
		String username = request.getParameter("username");
		if (username != null) {

			UserService service = new UserService();
			boolean isExist = service.checkUsername(username);

			String json = "{\"isExist\":" + isExist + "}";

			response.getWriter().write(json);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}