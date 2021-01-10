package com.brightcoding.app.ws.services;

import java.util.List;

import com.brightcoding.app.ws.shared.dto.BrandDto;

public interface BrandService {

	List<BrandDto> getAllBrands();
	BrandDto createBrand(BrandDto brandDto, String name);
	void deleteBrand(String BrandId);

	
}
