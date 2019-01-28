package cn.itcast.gjp.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
	private static BasicDataSource dataSource = new BasicDataSource();
	static {
		InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("database.properties");
		Properties pro = new Properties();
		try {
			pro.load(in);
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
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static DataSource getDataSource() {
		return dataSource;
	}
}
