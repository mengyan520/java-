package dc_97_JDBC自定义工具类;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtils {

	public JDBCUtils() {
		super();
	}

	private static Connection connection;

	public static Connection getConnection() {
		return connection;
	}

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 获得连接
			String url = "jdbc:mysql://localhost:3306/mybase?characterEncoding=utf8&useSSLx=false&serverTimezone=UTC&rewriteBatchedStatements=true";
			String username = "root";
			String password = "123456";
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			throw new RuntimeException(e + "数据库连接失败");
		}
	}

	public static void close(ResultSet resultSet, PreparedStatement psmt) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (psmt != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
