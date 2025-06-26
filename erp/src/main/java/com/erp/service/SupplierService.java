package com.erp.service;

import org.springframework.stereotype.Service;

import com.erp.repository.SupplierRepository;

@Service
public class SupplierService {

	public final SupplierRepository supplierRepository;
	
	public SupplierService(SupplierRepository supplierRepository) {
		this.supplierRepository = supplierRepository;
	}
}
