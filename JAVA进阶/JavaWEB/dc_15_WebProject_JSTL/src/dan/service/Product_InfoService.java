package dan.service;

import dan.dao.ProductDao;
import dan.dao.ProductInfoDao;
import dan.domain.Product;

public class Product_InfoService {

	public Product findProductInfo(String pid) {
		ProductInfoDao dao = new ProductInfoDao();
		Product product = dao.findProductInfo(pid);
		return product;
	}

}
