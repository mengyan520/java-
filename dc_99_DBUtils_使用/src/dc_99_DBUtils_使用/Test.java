package dc_99_DBUtils_使用;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

/*
 * DBUtils是java编程中的数据库操作实用工具，小巧简单实用。
 * DBUtils封装了对JDBC的操作，简化了JDBC操作，可以少写代码。
 * DBUtils就是JDBC的简化开发工具包。需要项目导入commons-dbutils-1.6.jar才能够正常使用DBUtils工具
 * */
public class Test {
	private static Connection connection = JDBCUtils.getConnection();

	public static void main(String[] args) throws SQLException {
//		insert();
//		update();
		delete();
	}

	public static void insert() throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		String sql = "INSERT INTO sort (sname,sprice,sdesc)VALUES(?,?,?)";
		Object[] params = { "体育用品", 289.32, "购买体育用品" };
		// 返回值int 代表执行成功的行数
		int row = queryRunner.update(connection, sql, params);
		System.out.println(row);
		DbUtils.closeQuietly(connection);
	}

	public static void update() throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		String sql = "update sort set sname=?,sprice=?,sdesc=? WHERE sid=?";
		Object[] params = { "花卉", 100.88, "情人节玫瑰花", 4 };
		// 返回值int 代表执行成功的行数
		int row = queryRunner.update(connection, sql, params);
		System.out.println(row);
		DbUtils.closeQuietly(connection);
	}
	public static void delete() throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		String sql = "delete from sort WHERE sid=?";
		Object[] params = {3};
		// 返回值int 代表执行成功的行数
		int row = queryRunner.update(connection, sql, params);
		System.out.println(row);
		DbUtils.closeQuietly(connection);
	}
}
