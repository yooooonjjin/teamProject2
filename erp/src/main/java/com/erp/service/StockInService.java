package com.erp.service;

import org.springframework.stereotype.Service;

import com.erp.repository.StockInRepository;

@Service
public class StockInService {

	public final StockInRepository stockInRepository;
	
	public StockInService(StockInRepository stockInRepository) {
		this.stockInRepository = stockInRepository;
	}
}
