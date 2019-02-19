package dan.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dan.domain.Product;
import dan.utils.DataSourceUtils;

public class ProductDao {

	public List<Product> findAllProduct() {
		// 操作数据库
		// 获取数据库商品列表数据
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from product";
		List<Product> products = null;
		try {
			products = runner.query(sql, new BeanListHandler<Product>(Product.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return products;
	}

}
