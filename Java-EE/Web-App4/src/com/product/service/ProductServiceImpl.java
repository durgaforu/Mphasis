package com.product.service;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.product.model.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao prodDao=new ProductDaoImpl();

	
	@Override
	public boolean saveProduct(Product prod) {

		return prodDao.saveProduct(prod);
	}

}
