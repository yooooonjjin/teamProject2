package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.entity.StockInDto;

public interface StockInRepository extends JpaRepository<StockInDto, Integer> {

}
