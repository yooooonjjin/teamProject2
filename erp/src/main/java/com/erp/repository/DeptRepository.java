package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.entity.DeptDto;

public interface DeptRepository extends JpaRepository<DeptDto, Integer> {

}
