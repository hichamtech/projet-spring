package com.brightcoding.app.ws.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brightcoding.app.ws.entities.CategoryEntity;
import com.brightcoding.app.ws.entities.ProductEntity;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {


	
}
