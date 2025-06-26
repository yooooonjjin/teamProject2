package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.entity.SupplierDto;

public interface SupplierRepository extends JpaRepository<SupplierDto, Integer> {

}
