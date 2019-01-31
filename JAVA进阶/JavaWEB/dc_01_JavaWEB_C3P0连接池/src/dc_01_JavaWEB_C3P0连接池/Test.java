package dc_01_JavaWEB_C3P0连接池;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
public class Test {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		// 创建连接池对象
		DataSource dataSource = C3P0Utils.getDataSource();
		// 获取连接
		connection = dataSource.getConnection();
		// 获取预处理对象
		String sql = "SELECT * FROM users WHERE username=? AND PASSWORD=?";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setObject(1, "a");
		preparedStatement.setObject(2, "1");
		// 获取结果集
		ResultSet rs = preparedStatement.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("username") + "   " + rs.getString("PASSWORD"));
		}
		// 释放资源
		rs.close();
		preparedStatement.close();
		connection.close();

	}

}
