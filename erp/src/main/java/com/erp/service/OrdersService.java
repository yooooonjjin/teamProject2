package com.erp.service;

import org.springframework.stereotype.Service;

import com.erp.repository.OrdersRepository;

@Service
public class OrdersService {
	
	public final OrdersRepository ordersRepository;
	
	public OrdersService(OrdersRepository ordersRepository) {
		this.ordersRepository = ordersRepository;
	}

}
