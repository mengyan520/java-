package dan.service;

import java.util.List;

import dan.dao.ProductDao;
import dan.domain.Category;
import dan.domain.Product;

public class AdminAddProductUIService {

	public List<Category> findAllCategory() {
		ProductDao dao = new ProductDao();
		List<Category> categorys = dao.findAllCategory();
		return categorys;
	}

}
