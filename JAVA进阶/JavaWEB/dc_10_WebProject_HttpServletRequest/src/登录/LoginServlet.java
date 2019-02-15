package 登录;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;


import utils.DataSourceUtils;
import 用户注册.User;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取用户数据
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// 验证
		User user = null;
		try {
			user = login(username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (user != null) {
			//跳转首页
			response.sendRedirect(request.getContextPath());
		}else {
			//返回错误信息
			request.setAttribute("loginInfo", "用户名或密码错误");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public User login(String username, String password) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user where username=? and password=?";
		User user = queryRunner.query(sql, new BeanHandler<User>(User.class), username, password);
		return user;
	}
}