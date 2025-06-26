package com.erp.service;

import org.springframework.stereotype.Service;

import com.erp.repository.StockOutItemRepository;

@Service
public class StockOutItemService {

	public final StockOutItemRepository stockOutItemRepository;

	public StockOutItemService(StockOutItemRepository stockOutItemRepository) {
		this.stockOutItemRepository = stockOutItemRepository;
	}
}
