package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.entity.OrdersDto;

public interface OrdersRepository extends JpaRepository<OrdersDto, Integer> {

}
