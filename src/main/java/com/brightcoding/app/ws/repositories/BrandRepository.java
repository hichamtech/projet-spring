package com.brightcoding.app.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brightcoding.app.ws.entities.BrandEntity;


@Repository

public interface BrandRepository  extends CrudRepository<BrandEntity, Long>
{

	BrandEntity findById(String brandId);
}
