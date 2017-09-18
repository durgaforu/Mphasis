package com.product.service;

import com.dao.ProductDao;
import com.product.model.Product;

public interface ProductService {

	boolean saveProduct(Product prod);

}