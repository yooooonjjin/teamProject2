package com.erp.service;

import org.springframework.stereotype.Service;

import com.erp.repository.ProductRepository;

@Service
public class ProductService {

	public final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
}
