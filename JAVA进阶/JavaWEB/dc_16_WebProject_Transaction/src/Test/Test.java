package Test;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import dan.utils.DataSourceUtils;

public class Test {
	public static void main(String[] args) {
		Connection connection = null;
		QueryRunner runner = new QueryRunner();
		try {
			connection = DataSourceUtils.getConnection();
			connection.setAutoCommit(false);
			runner.update(connection, "update account set money=25000 where name='tom'");
//			int i=1/0;
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
