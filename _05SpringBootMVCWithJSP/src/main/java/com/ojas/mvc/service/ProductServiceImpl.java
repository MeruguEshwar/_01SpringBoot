package com.ojas.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.mvc.Entity.ProductEntity;
import com.ojas.mvc.model.Product;
import com.ojas.mvc.repo.ProductRepo;


@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepo productrepo;

	@Override
	public int CreateProduct(Product product) {
	
		int count = 0;
		
		ProductEntity productEntity = new ProductEntity();
		
//		productEntity.setProductName(product.getProductName());
//		productEntity.setProductPrice(product.getProductPrice());
//		productEntity.setProductQuantity(product.getProductQuantity());
		
		
		//instead of setting and getting products we can using beanutils
		BeanUtils.copyProperties(product, productEntity);
		
		ProductEntity pe = productrepo.save(productEntity);
		
		if(pe != null) {
			count = 1;
		}
		
		return count;
	}

	@Override
	public List<Product> viewProduct() {
		
		List<Product>addProducts=new ArrayList<Product>();
		
		List<ProductEntity> productlist = productrepo.findAll();
		
		for(ProductEntity productentity:productlist) {
			
			ProductEntity productEntity = new ProductEntity();
			BeanUtils.copyProperties(productentity, productEntity);
			productlist.add(productEntity);
		}
		return addProducts;
	}

	
}
