package com.brightcoding.app.ws.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.brightcoding.app.ws.entities.CategoryEntity;
import com.brightcoding.app.ws.entities.ProductEntity;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {


	List<ProductEntity> findByCategory(CategoryEntity category);
	
	ProductEntity findByProductId(String productId);
}
