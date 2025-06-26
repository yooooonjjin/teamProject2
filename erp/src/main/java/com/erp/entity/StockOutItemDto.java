package com.erp.entity;

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
@Table(name="STOCKOUTITEM")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StockOutItemDto {

	// 작업지시 상세 ID
	@Id	// 기본키 설정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stoitmid; 
	
	// 비고
	@Column(length = 255)
	private String stoitmnote;
	
	// 지시 수량
	@Column(nullable = false)
	private int stoitmqty;
	
	// 작업지시 ID (FK)
	@Column(nullable = false)
	private int stoid; 
	
	// 상품 ID (FK)
	@Column(nullable = false)
	private int prdid;
}
