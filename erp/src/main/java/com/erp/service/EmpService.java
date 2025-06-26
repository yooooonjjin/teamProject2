package com.erp.service;

import org.springframework.stereotype.Service;

import com.erp.repository.EmpRepository;

@Service
public class EmpService {
	
	public final EmpRepository empRepository;
	
	public EmpService(EmpRepository empRepository) {
		this.empRepository = empRepository;
	}
	

}
