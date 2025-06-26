package com.erp.service;

import org.springframework.stereotype.Service;

import com.erp.repository.DeptRepository;

@Service
public class DeptService {

	public final DeptRepository deptRepository;
	
	public DeptService(DeptRepository deptRepository) {
		this.deptRepository = deptRepository;
	}
}
