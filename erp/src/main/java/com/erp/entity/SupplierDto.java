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
@Table(name="SUPPLIER")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupplierDto {

	// 공급처 ID
	@Id	// 기본키 설정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int supid;
	
	// 공급처명
	@Column(nullable = false, length = 100)
	private String supnm; 
	
	// 담당자 이름
	@Column(nullable = false, length = 50)
	private String suppicid;  
	
	// 연락처
	@Column(nullable = false, length = 20)
	private String suptel;  
	
	// 주소
	@Column(nullable = false, length = 255)
	private String supaddr;
	
	// 등록일
	@Column(nullable = false)
	private Date supcrdt;
	
	// 수정일
	private Date supupdt; 
}