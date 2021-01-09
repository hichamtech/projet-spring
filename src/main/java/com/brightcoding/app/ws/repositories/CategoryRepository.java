package com.brightcoding.app.ws.repositories;

import org.springframework.data.repository.CrudRepository;

import com.brightcoding.app.ws.entities.CategoryEntity;

public interface CategoryRepository  extends CrudRepository<CategoryEntity, Long> {
	


}
