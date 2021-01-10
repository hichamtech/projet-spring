package com.brightcoding.app.ws.services.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightcoding.app.ws.entities.AddressEntity;
import com.brightcoding.app.ws.entities.CategoryEntity;
import com.brightcoding.app.ws.entities.UserEntity;
import com.brightcoding.app.ws.repositories.AddressRepository;
import com.brightcoding.app.ws.repositories.CategoryRepository;
import com.brightcoding.app.ws.repositories.UserRepository;
import com.brightcoding.app.ws.services.CategoryService;
import com.brightcoding.app.ws.shared.Utils;
import com.brightcoding.app.ws.shared.dto.CategoryDto;
import com.brightcoding.app.ws.shared.dto.CategoryDto;
import com.brightcoding.app.ws.shared.dto.UserDto;

@Service
public class CategoryServiceIml implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Utils util;
	
	@Override
	public List<CategoryDto> getAllCategories() {
		
		List<CategoryEntity> categories = (List<CategoryEntity>) categoryRepository.findAll() ;
		
		Type listType = new TypeToken<List<CategoryDto>>() {}.getType();
		List<CategoryDto> categoryDto = new ModelMapper().map(categories, listType);
		

		return categoryDto;
	}

	@Override
	public CategoryDto createCategory(CategoryDto category, String name) {

		category.setCode (util.generateStringId(30));

		ModelMapper modelMapper = new ModelMapper();
		
		CategoryEntity categoryEntity = modelMapper.map(category, CategoryEntity.class); 
		CategoryEntity newCategory = categoryRepository.save(categoryEntity);
		
		CategoryDto categoryDto = modelMapper.map(newCategory, CategoryDto.class);
		
		return categoryDto;
	
	}

	@Override
	public void deleteCategory(String CategoryId) {
	CategoryEntity category = categoryRepository.findById(CategoryId);
		
		if(category == null) throw new RuntimeException("Address not found");
		
		categoryRepository.delete(category);		
	}

	

}
