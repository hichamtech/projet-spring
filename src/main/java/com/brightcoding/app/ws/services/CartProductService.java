package com.brightcoding.app.ws.services;

import com.brightcoding.app.ws.entities.CartProductEntity;
import com.brightcoding.app.ws.shared.dto.CartProductDto;
import com.brightcoding.app.ws.shared.dto.CategoryDto;

import java.util.List;

public interface CartProductService {

    List<CartProductDto> getAllCartProducts();


    CartProductDto createCartProducts(int quantity , CartProductEntity cartProductEntity);


    void deleteCartProducts(String CategoryId);

}
