package com.gearshop.service;

import java.util.List;

import com.gearshop.model.Product;

public interface ProductService {
	
    Product getProductById(int productId);
	
	List<Product> getAllProducts();

	List<Product> getHotProducts();
	
	List<Product> getProductByCate(String cateId);
	
	List<Product> getProductByName(String name);
}