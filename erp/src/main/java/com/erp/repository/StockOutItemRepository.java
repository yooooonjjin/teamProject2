package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.entity.StockOutItemDto;

public interface StockOutItemRepository extends JpaRepository<StockOutItemDto, Integer> {

}
