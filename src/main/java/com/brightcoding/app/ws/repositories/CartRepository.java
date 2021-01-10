package com.brightcoding.app.ws.repositories;

import com.brightcoding.app.ws.entities.CartEntity;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<CartEntity,Long> {
}
