package com.ojas.mvc.service;

import java.util.List;

import com.ojas.mvc.model.Product;

public interface ProductService {

	int addProduct(Product product);
	
	List<Product> viewProduct();
}
