package Cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendCookieServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建cookie
		Cookie cookie = new Cookie("age", "16");
		//设置删除时间 秒单位
		cookie.setMaxAge(60);
		//设置Cookie的携带路径,代表访问这个路径时才携带cookie信息
		cookie.setPath(request.getContextPath()+"/sendCookie");
		//发送cookie
		response.addCookie(cookie);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}