package com.erp.service;

import org.springframework.stereotype.Service;

import com.erp.repository.ClientRepository;

@Service
public class ClientService {

	public final ClientRepository clientRepository;
	
	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
}
