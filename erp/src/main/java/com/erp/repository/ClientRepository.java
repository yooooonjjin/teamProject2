package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.entity.ClientDto;


public interface ClientRepository extends JpaRepository<ClientDto, Integer> {

}
