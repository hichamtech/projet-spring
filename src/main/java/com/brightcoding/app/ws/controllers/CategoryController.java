package com.brightcoding.app.ws.controllers;

import java.lang.reflect.Type;
import java.security.Principal;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brightcoding.app.ws.requests.AddressRequest;
import com.brightcoding.app.ws.requests.CategoryRequest;
import com.brightcoding.app.ws.responses.CategoryResponse;
import com.brightcoding.app.ws.responses.CategoryResponse;
import com.brightcoding.app.ws.services.CategoryService;
import com.brightcoding.app.ws.shared.dto.CategoryDto;
import com.brightcoding.app.ws.shared.dto.CategoryDto;


@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	//get all categories
	
	@GetMapping("/list")
	public ResponseEntity<List<CategoryResponse>>getCategories() {
		
		List<CategoryDto> categories = categoryService.getAllCategories();
		
		Type listType = new TypeToken<List<CategoryResponse>>() {}.getType();
		List<CategoryResponse> categoriesResponse = new ModelMapper().map(categories, listType);
		
		return new ResponseEntity<List<CategoryResponse>>(categoriesResponse, HttpStatus.OK);
		
	}
	//create category
	@PostMapping("/create")
			
	public ResponseEntity<CategoryResponse> createCategory(@RequestBody CategoryRequest categoryRequest, Principal principal) {
		
		ModelMapper modelMapper = new ModelMapper();
		
		CategoryDto categoryDto = modelMapper.map(categoryRequest, CategoryDto.class);
		CategoryDto createCategory = categoryService.createCategory(categoryDto, principal.getName());
		
		CategoryResponse newCategory = modelMapper.map(createCategory, CategoryResponse.class);
		
		return new ResponseEntity<CategoryResponse>(newCategory, HttpStatus.CREATED);
	}
	
	//update category
	
	@PutMapping("update/{id}")
	public ResponseEntity<String> updateCategory(@PathVariable(name="id") String categoryId) {
		return new ResponseEntity<>("update category", HttpStatus.ACCEPTED);
	}
	
	
	//delete categorie
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCategory(@PathVariable(name="id") String categoryId) {
		
		categoryService.deleteCategory(categoryId);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
