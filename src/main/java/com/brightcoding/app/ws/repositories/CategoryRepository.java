package com.brightcoding.app.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brightcoding.app.ws.entities.CategoryEntity;

@Repository
public interface CategoryRepository  extends CrudRepository<CategoryEntity, Long> {
	


}
