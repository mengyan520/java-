package dan.service;

import java.sql.SQLException;
import java.util.List;

import dan.dao.AdminProductDao;
import dan.domain.Product;
import dan.vo.Condition;
import dan.domain.Category;

public class AdminProductService {

	// 添加数据
	public void addProduct(Product product) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.addProduct(product);
	}

	public void delProductByPid(String pid) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.delProductByPid(pid);
	}

	// 根据pid查询商品对象
	public Product findProductByPid(String pid) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.findProductByPid(pid);
	}

	// 更新商品
	public void updateProduct(Product product) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.updateProduct(product);
	}

	// 获得所有的类别
	public List<Category> findAllCategory() throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.findAllCategory();
	}

	// 根据条件查询商品列表
	public List<Product> findProductListByCondition(Condition condition) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.findProductListByCondition(condition);
	}

}
