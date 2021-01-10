package com.brightcoding.app.ws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brightcoding.app.ws.services.BrandService;import com.brightcoding.app.ws.shared.dto.CategoryDto;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Autowired
	BrandService brandService;
	
	
}
