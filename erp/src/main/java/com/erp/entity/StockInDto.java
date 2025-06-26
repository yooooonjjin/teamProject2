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
@Table(name="STOCKIN")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StockInDto {

	// 입고 ID
	@Id	// 기본키 설정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sktid;

	// 입고 수량
	@Column(nullable = false)
	private int sktrcvqty;  
	
	// 입고 처리일
	@Column(nullable = false)
	private Date sktrcvdt;  

	// 입고 상태 (입고 진행중, 입고 완료)
	@Column(nullable = false, length = 50)
	private String sktstat;

	// 등록일
	@Column(nullable = false)
	private Date sktcrdt;  

	// 수정일
	private Date sktupdt;  

	// 입고 담당자
	@Column(nullable = false, length = 50)
	private String sktpicid;

}
