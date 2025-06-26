package com.erp.service;

import org.springframework.stereotype.Service;

import com.erp.repository.MaterialRepository;

@Service
public class MaterialService {

	public final MaterialRepository materialRepository;
	
	public MaterialService(MaterialRepository materialRepository) {
		this.materialRepository = materialRepository;
	}
}
