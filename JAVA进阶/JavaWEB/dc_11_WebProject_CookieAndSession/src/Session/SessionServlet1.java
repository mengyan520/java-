package Session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//此方法会获得专属于当前会话的Session对象，如果服务器端没有该会话的Session对象会创建一个新的Session返回
		//如果已经有了属于该会话的Session直接将已有的Session返回
		HttpSession session = request.getSession();
		//获取session编号ID
		String idString = session.getId();
		response.getWriter().write("JSESSIONID:"+idString);
		session.setAttribute("name", "danche");
		//为session做持久化，通过cookie保存
		Cookie cookie = new Cookie("JSESSIONID", idString);
		cookie.setMaxAge(10*60);
		response.addCookie(cookie);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}