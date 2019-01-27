package dc_98_JDBC_properties配置文件;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Test {
	public static void main(String[] args) throws IOException, SQLException {
//		//使用类加载起，加载文件
//		InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("database.properties");
//		Properties properties = new Properties();
//		properties.load(inputStream);
//		inputStream.close();
//		System.out.println(properties);
		Connection connection = JDBCUtils.getConnection();
		String sql = "select * from sort";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.println(resultSet.getObject("sname"));
		}
		JDBCUtils.close(resultSet, preparedStatement);
	}
}
