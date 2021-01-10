package com.brightcoding.app.ws.controllers;

import com.brightcoding.app.ws.entities.CartProductEntity;
import com.brightcoding.app.ws.repositories.CartProductRepository;
import com.brightcoding.app.ws.responses.CartProdcutResponse;
import com.brightcoding.app.ws.services.CartProductService;
import com.brightcoding.app.ws.shared.dto.CartProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cartsproducts")
public class CartProductController {

    @Autowired
    CartProductService cartProductService;

    //add the categorie CRUD
   /* @GetMapping("/list")
	public ResponseEntity<List<cartProductService>>getCartProducts() {

		List<CartProductDto> categories = cartProductService.();

		Type listType = new TypeToken<List<CategoryResponse>>() {}.getType();
		List<CategoryResponse> categoriesResponse = new ModelMapper().map(categories, listType);

		return new ResponseEntity<List<CategoryResponse>>(categoriesResponse, HttpStatus.OK);

	}*/



}
