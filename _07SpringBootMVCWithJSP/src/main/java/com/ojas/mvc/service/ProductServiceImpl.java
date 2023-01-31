package com.ojas.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.mvc.Entity.ProductEntity;
import com.ojas.mvc.Repo.ProductRepo;
import com.ojas.mvc.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;

	public int addProduct(Product product) {

		int count = 0;
		ProductEntity productEntity = new ProductEntity();
		BeanUtils.copyProperties(product, productEntity);
		ProductEntity pe = productRepo.save(productEntity);

		if (pe != null) {
			count++;
		}
		return count;
	}

	public List<Product> viewProduct() {

		List<Product> products = new ArrayList<Product>();

		List<ProductEntity> productEntities = productRepo.findAll();

		for (ProductEntity productEntity : productEntities) {

			Product product = new Product();
			BeanUtils.copyProperties(products, productEntities);

			products.add(product);
		}

		return products;
	}

}
