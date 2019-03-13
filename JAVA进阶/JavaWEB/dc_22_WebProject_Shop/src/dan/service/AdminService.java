package dan.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import dan.dao.AdminDao;
import dan.domain.Category;
import dan.domain.Order;
import dan.domain.Product;

public interface AdminService {

	public List<Category> findAllCategory();

	public void saveProduct(Product product) throws SQLException;

	public List<Order> findAllOrders();

	public List<Map<String, Object>> findOrderInfoByOid(String oid);

}
