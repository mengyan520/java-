package dc_96_JDBC_PrepareStatement接口;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
1.预处理对象
2.使用PreparedStatement预处理对象时，建议每条sql语句所有的实际参数，都使用逗号分隔。
注意：
主要功能防止sql注入攻击
PreparedStatement接口的实现类在数据库的驱动中
 * */
public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 注册驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 获得连接
		String url = "jdbc:mysql://localhost:3306/mybase?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
		String username = "root";
		String password = "123456";
		Connection con = DriverManager.getConnection(url, username, password);
		Scanner sc = new Scanner(System.in);
//		String user = sc.nextLine();
//		String pass = sc.nextLine();
		String sql = "SELECT * FROM users WHERE username=? AND PASSWORD=?";
		// 调用Connection接口的方法prepareStatement,获取PrepareStatement接口的实现类
		PreparedStatement psmt = con.prepareStatement(sql);
		//调用psmt对象set方法,设置问号占位符上的参数
		psmt.setObject(1, "a");
		psmt.setObject(2, "1");
		//调用方法,执行SQL,获取结果集
		ResultSet rs = psmt.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString("username")+"   "+rs.getString("PASSWORD"));
		}
		// 释放资源
		rs.close();
		psmt.close();
		con.close();
	}
}
