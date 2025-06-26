package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.entity.StockOutDto;

public interface StockOutRepository extends JpaRepository<StockOutDto, Integer>{

}
