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
@Table(name="PRODUCTIONORDER")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductionOrderDto {

	// 작업지시 ID
	@Id	// 기본키 설정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stoid;
	
	// 지시일자
	@Column(nullable = false)
	private Date stodt;
	
	// 납기일자
	@Column(nullable = false)
	private Date stoduedt;
	
	// 수정일자
	private Date stoupdt; 
	
	// 지시 담당자 (사원번호, FK)
	@Column(nullable = false, length = 50)
	private String stopicid; 
	
	// 출하창고명
	@Column(nullable = false, length = 50)
	private String stowh;
	
	// 작업상태 (대기, 진행중, 완료)
	@Column(nullable = false, length = 20)
	private String stostat;
	
	// 비고
	@Column(length = 255)
	private String stonote;
	
	// 거래처 ID (FK)
	@Column(nullable = false)
	private int cltid;
}
