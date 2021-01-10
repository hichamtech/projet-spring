package com.brightcoding.app.ws.services;
import java.util.List;

import com.brightcoding.app.ws.shared.dto.CategoryDto;


public interface CategoryService {
	
	List<CategoryDto> getAllCategories();
	

	CategoryDto createCategory(CategoryDto categoryDto, String name);
	
}
