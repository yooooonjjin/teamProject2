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
@Table(name="EMP")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmpDto {
	
	// 사원 ID
	@Id	// 기본키 설정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;  
	
	// 사원명
	@Column(nullable = false, length = 50)
	private String empnm; 
	
	// 직급명
	@Column(nullable = false, length = 50)
	private String emppos;  
	
	// 이메일
	@Column(nullable = false, unique = true, length = 100)
	private String empemail; 
	
	// 연락처
	@Column(nullable = false, length = 20)
	private String emptel;  
	
	// 입사일
	@Column(nullable = false)
	private Date empindate;  
}
