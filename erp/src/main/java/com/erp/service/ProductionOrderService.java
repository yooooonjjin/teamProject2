package com.erp.service;

import org.springframework.stereotype.Service;

import com.erp.repository.ProductionOrderRepository;

@Service
public class ProductionOrderService {

	public final ProductionOrderRepository productionOrderRepository;
	
	public ProductionOrderService(ProductionOrderRepository productionOrderRepository) {
		this.productionOrderRepository = productionOrderRepository;
	}
}
