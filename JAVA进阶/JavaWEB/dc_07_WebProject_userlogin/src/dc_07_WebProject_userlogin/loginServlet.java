package dc_07_WebProject_userlogin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import domain.User;
import utils.DataSourceUtils;

public class loginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//从数据库获取数据比较
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from users where username=? and password=?";
		User user = null;
		try {
			user = runner.query(sql, new BeanHandler<User>(User.class),username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//显示数据
		if (user != null) {
			response.getWriter().write(user.toString());
		}else {
			response.getWriter().write("sorry your username or password is wrong");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}