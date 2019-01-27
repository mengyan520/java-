package dc_100_DBUtils_查询;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

public class Test {
	private static Connection connection = JDBCUtils.getConnection();

	public static void main(String[] args) throws SQLException {
		QueryRunner queryRunne = new QueryRunner();
//		arrayHandler(queryRunne);
//		arraylistHandler(queryRunne);
//		beanHandler(queryRunne);
//		beanlistHandler(queryRunne);
//		columnListHandler(queryRunne);
//		scalarHandler(queryRunne);
//		mapHandler(queryRunne);
		maplistHandler(queryRunne);
		DbUtils.closeQuietly(connection);
	}

	// ArrayHandler ,保存结果集的第一条数据
	public static void arrayHandler(QueryRunner queryRunne) throws SQLException {
		String sql = "select * from sort where sid=?";
		ResultSetHandler<Object[]> res = new ArrayHandler();
		Object[] pms = { 4 };
		Object[] result = queryRunne.query(connection, sql, res, pms);
		for (int i = 0; i < result.length; i++) {
			Object object = result[i];
			System.out.println(object);
		}
	}

	// ArrayListHandler 将结果集中的每一条记录都封装到一个Object[]数组中，将这些数组在封装到List集合中
	public static void arraylistHandler(QueryRunner queryRunne) throws SQLException {
		String sql = "select * from sort";
		ResultSetHandler<List<Object[]>> res = new ArrayListHandler();
		List<Object[]> result = queryRunne.query(connection, sql, res);
		Iterator<Object[]> iterator = result.iterator();
		while (iterator.hasNext()) {
			Object[] objects = (Object[]) iterator.next();
			for (int i = 0; i < objects.length; i++) {
				Object object = objects[i];
				System.out.print(object + "\t");
			}
			System.out.println();
			System.out.println("======");
		}
	}

	// BeanHandler 将结果集中第一条记录封装到一个指定的javaBean中，没有数据则为null
	public static void beanHandler(QueryRunner queryRunne) throws SQLException {
		String sql = "select * from sort";
		ResultSetHandler<SortModel> resultSetHandler = new BeanHandler<SortModel>(SortModel.class);
		SortModel model = queryRunne.query(connection, sql, resultSetHandler);
		System.out.println(model);
	}

	// BeanListHandler 将结果集中每一条记录封装到指定的javaBean中，将这些javaBean在封装到List集合中
	public static void beanlistHandler(QueryRunner queryRunne) throws SQLException {
		String sql = "select * from sort";
		ResultSetHandler<List<SortModel>> resultSetHandler = new BeanListHandler<SortModel>(SortModel.class);
		List<SortModel> list = queryRunne.query(connection, sql, resultSetHandler);
		Iterator<SortModel> iterator = list.iterator();
		while (iterator.hasNext()) {
			SortModel sortModel = (SortModel) iterator.next();
			System.out.println(sortModel);
		}
	}

	// ColumnListHandler 将结果集中指定的列的字段值，封装到一个List集合中
	public static void columnListHandler(QueryRunner queryRunne) throws SQLException {
		String sql = "select * from sort";
		// new ColumnListHandler<Object>(2);//第几列，不推荐用
		ResultSetHandler<List<Object>> resultSetHandler = new ColumnListHandler<Object>("sname");
		List<Object> list = queryRunne.query(connection, sql, resultSetHandler);
		for (Object object : list) {
			System.out.println(object);
		}
	}

	// ScalarHandler 它是用于单数据。例如select count(*) from 表操作
	public static void scalarHandler(QueryRunner queryRunne) throws SQLException {
		String sql = "select count(*) from sort";
		ResultSetHandler<Object> resultSetHandler = new ScalarHandler();
		Object object = queryRunne.query(connection, sql, resultSetHandler);
		System.out.println(object);
	}

	// MapHandler 将结果集第一行封装到Map集合中,Key 列名, Value 该列数据
	public static void mapHandler(QueryRunner queryRunne) throws SQLException {
		String sql = "select * from sort";
		ResultSetHandler<Map<String, Object>> resultSetHandler = new MapHandler();
		Map<String, Object> map = queryRunne.query(connection, sql, resultSetHandler);
		System.out.println(map);
	}

	// MapListHandler 将结果集第一行封装到Map集合中,Key 列名, Value 该列数据,Map集合存储到List集合
	public static void maplistHandler(QueryRunner queryRunne) throws SQLException {
		String sql = "select * from sort";
		ResultSetHandler<List<Map<String, Object>>> resultSetHandler = new MapListHandler();
		List<Map<String, Object>> list = queryRunne.query(connection, sql, resultSetHandler);
		System.out.println(list);
	}
}
