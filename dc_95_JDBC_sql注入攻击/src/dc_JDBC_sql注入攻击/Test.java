package dc_JDBC_sql注入攻击;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 注册驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 获得连接
		String url = "jdbc:mysql://localhost:3306/mybase?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
		String username = "root";
		String password = "123456";
		Connection con = DriverManager.getConnection(url, username, password);
		// 获得语句执行平台, 通过数据库连接对象,获取到SQL语句的执行者对象
		Statement stat = con.createStatement();
		//查续集
		String sql = "SELECT * FROM users WHERE username='a' AND PASSWORD='1' OR 1=1";
		ResultSet resultSet = stat.executeQuery(sql);
		while (resultSet.next()) {
			System.out.println(resultSet.getObject("username")+"="+resultSet.getObject("PASSWORD"));
		}
		//释放资源
		resultSet.close();
		stat.close();
		con.close();
	}
}
