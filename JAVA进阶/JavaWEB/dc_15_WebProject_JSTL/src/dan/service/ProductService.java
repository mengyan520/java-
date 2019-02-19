package dan.service;

import java.util.List;

import dan.dao.ProductDao;
import dan.domain.Product;

public class ProductService {

	public List<Product> findAllProduct() {
		//没有复杂业务
		//传递请求到dao层
		ProductDao dao = new ProductDao();
		List<Product> products = dao.findAllProduct();
		return products;
	}

}
