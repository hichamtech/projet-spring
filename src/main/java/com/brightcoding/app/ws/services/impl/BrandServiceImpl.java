package com.brightcoding.app.ws.services.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightcoding.app.ws.entities.BrandEntity;
import com.brightcoding.app.ws.entities.CategoryEntity;
import com.brightcoding.app.ws.repositories.BrandRepository;
import com.brightcoding.app.ws.repositories.UserRepository;
import com.brightcoding.app.ws.services.BrandService;
import com.brightcoding.app.ws.shared.Utils;
import com.brightcoding.app.ws.shared.dto.BrandDto;
import com.brightcoding.app.ws.shared.dto.CategoryDto;
import com.brightcoding.app.ws.shared.dto.BrandDto;

@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	BrandRepository brandRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Utils util;

	@Override
	public List<BrandDto> getAllBrands() {
		
		List<BrandEntity> brands = (List<BrandEntity>) brandRepository.findAll() ;
	
		Type listType = new TypeToken<List<BrandDto>>() {}.getType();
		List<BrandDto> brandDto = new ModelMapper().map(brands, listType);


		return brandDto;
	}

	@Override
	public BrandDto createBrand(BrandDto brand, String name) {
		brand.setCode (util.generateStringId(30));

		ModelMapper modelMapper = new ModelMapper();
		
		BrandEntity brandEntity = modelMapper.map(brand, BrandEntity.class); 
		BrandEntity newBrand = brandRepository.save(brandEntity);
		
		BrandDto brandDto = modelMapper.map(newBrand, BrandDto.class);
		
		return brandDto;
	}

	

	@Override
	public void deleteBrand(String BrandId) {

		BrandEntity brand = brandRepository.findById(BrandId);

		if(brand == null) throw new RuntimeException("Brand not found");
		
		brandRepository.delete(brand);
	}
	
	
}
