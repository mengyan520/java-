package dc_102_DBCP_连接池封装;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

public class Test {

	public static void main(String[] args) {
		DataSource dataSource = JDBCUtils.getDataSource();
		// 调用对象方法getConnection获取数据库的连接
		try {
			Connection con = dataSource.getConnection();
			QueryRunner queryRunner = new QueryRunner();
			List<Map<String, Object>> list = queryRunner.query(con, "select * from sort", new MapListHandler());
			System.out.println(list);
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("数据库连接失败");
		}
	}

}
