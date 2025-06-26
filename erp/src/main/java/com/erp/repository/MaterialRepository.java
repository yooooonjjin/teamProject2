package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.entity.MaterialDto;

public interface MaterialRepository extends JpaRepository<MaterialDto, Integer> {

}
