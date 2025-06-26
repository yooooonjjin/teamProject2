package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.entity.ProductDto;

public interface ProductRepository extends JpaRepository<ProductDto, Integer> {

}
