package dc_100_DBUtils_查询;

import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class JDBCUtils {

	public JDBCUtils() {
		super();
	}

	private static Connection connection;
	private static String driverClass;
	private static String url;
	private static String username;
	private static String password;

	public static Connection getConnection() {
		return connection;
	}

	static {
		try {
			readConfig();
			Class.forName(driverClass);
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			throw new RuntimeException(e + "数据库连接失败");
		}
	}

	private static void readConfig() throws Exception {
		InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("database.properties");
		Properties pro = new Properties();
		pro.load(in);
		driverClass = pro.getProperty("driverClass");
		url = pro.getProperty("url");
		username = pro.getProperty("username");
		password = pro.getProperty("password");
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
