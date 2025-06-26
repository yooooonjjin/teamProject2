package com.erp.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="DEPT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeptDto {

	// 부서 ID
	@Id	// 기본키 설정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptid; 
	
	// 부서명
	@Column(nullable = false, length = 100)
	private String deptnm;  
	
	// 등록일
	private Date deptcrdt;  
	
	// 수정일
	private Date deptupdt;  

}
