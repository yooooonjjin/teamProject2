package com.erp.service;

import org.springframework.stereotype.Service;

import com.erp.repository.StockOutRepository;

@Service
public class StockOutService {

	public final StockOutRepository stockOutRepository;

	public StockOutService(StockOutRepository stockOutRepository) {
		this.stockOutRepository = stockOutRepository;
	}
}
