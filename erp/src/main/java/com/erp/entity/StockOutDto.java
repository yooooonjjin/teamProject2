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
@Table(name = "STOCKOUT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StockOutDto {

	// 출고 ID
	@Id	// 기본키 설정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int podid; 
	
	// 출고 코드
	@Column(nullable = false, unique = true, length = 20)
	private String podcd;
	
	// 출고 수량
	@Column(nullable = false)
	private int podqty; 
	
	// 출고 일자
	@Column(nullable = false)
	private Date poddt;
	
	// 출고 상태 (출고 완료, 출고 취소)
	@Column(nullable = false, length = 50)
	private String podstat;
	
	// 출고 담당자
	@Column(nullable = false, length = 50)
	private String podpicid;
	
	// 비고
	@Column(length = 255)
	private String podnote;
	
	// 거래처 ID (FK)
	@Column(nullable = false)
	private int cltid; 
	
	// 상품 ID (FK)
	@Column(nullable = false)
	private int prdid; 
	
	// 작업지시 ID (FK)
	@Column(nullable = false)
	private int stoid; 
}
