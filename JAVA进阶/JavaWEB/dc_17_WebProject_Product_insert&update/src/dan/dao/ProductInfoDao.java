package dan.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import dan.domain.Product;
import dan.utils.DataSourceUtils;

public class ProductInfoDao {

	public Product findProductInfo(String pid) {
		// 操作数据库
		// 获取数据库商品列表数据
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from product where pid=?";
		Product product = null;
		try {
			product = runner.query(sql, new BeanHandler<Product>(Product.class),pid);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return product;
	}

}
