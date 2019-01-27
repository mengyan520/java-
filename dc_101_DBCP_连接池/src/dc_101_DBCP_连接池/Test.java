package dc_101_DBCP_连接池;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

public class Test {

	public static void main(String[] args) throws IOException, SQLException {
		InputStream in = Test.class.getClassLoader().getResourceAsStream("database.properties");
		Properties pro = new Properties();
		pro.load(in);
		BasicDataSource dataSource = new BasicDataSource();
		// 连接数据库的4个最基本信息,通过对象方法setXXX设置进来
		dataSource.setDriverClassName(pro.getProperty("driverClass"));
		dataSource.setUrl(pro.getProperty("url"));
		dataSource.setUsername(pro.getProperty("username"));
		dataSource.setPassword(pro.getProperty("password"));
		// 对象连接池中的连接数量配置,可选的
		dataSource.setInitialSize(10);// 初始化的连接数
		dataSource.setMaxActive(8);// 最大连接数量
		dataSource.setMaxIdle(5);// 最大空闲数
		dataSource.setMinIdle(1);// 最小空闲
		// 调用对象方法getConnection获取数据库的连接
		try {
			Connection con = dataSource.getConnection();
			QueryRunner queryRunner = new QueryRunner();
			List<Map<String, Object>> list = queryRunner.query(con, "select * from sort", new MapListHandler());
			System.out.println(list);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("数据库连接失败");
		}
	}

}
