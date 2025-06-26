package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.entity.EmpDto;

public interface EmpRepository extends JpaRepository<EmpDto, Integer> {

}
