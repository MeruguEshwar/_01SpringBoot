package com.ojas.mvc.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.mvc.Entity.ProductEntity;
import com.ojas.mvc.model.Product;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
