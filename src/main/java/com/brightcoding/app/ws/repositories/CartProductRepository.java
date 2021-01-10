package com.brightcoding.app.ws.repositories;

import com.brightcoding.app.ws.entities.CartProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface CartProductRepository extends CrudRepository<CartProductEntity,Long> {
}
