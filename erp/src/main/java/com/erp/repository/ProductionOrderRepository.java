package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.entity.ProductionOrderDto;

public interface ProductionOrderRepository extends JpaRepository<ProductionOrderDto, Integer>{

}
