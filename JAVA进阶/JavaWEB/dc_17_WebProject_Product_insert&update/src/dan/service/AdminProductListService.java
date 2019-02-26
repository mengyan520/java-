package dan.service;

import java.util.List;

import dan.dao.ProductDao;
import dan.domain.Product;

public class AdminProductListService {

	public List<Product> findAllProduct() {
		ProductDao dao = new ProductDao();
		List<Product> products = dao.findAllProduct();
		return products;
	}

}
