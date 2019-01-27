package dc_97_JDBC自定义工具类;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {
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
