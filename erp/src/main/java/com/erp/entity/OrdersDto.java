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
@Table(name="ORDERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrdersDto {

	// 발주 ID
	@Id	// 기본키 설정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ordid; 
	
	// 발주 수량
	@Column(nullable = false)
    private int ordqty; 
	
	// 발주 단가
	@Column(nullable = false)
    private int orduprc;

	// 총 금액 (수량 * 단가)
	@Column(nullable = false)
    private int ordtprc;

	// 납기일
	@Column(nullable = false)
    private Date orddue;

	// 발주 상태 (발주 완료, 입고 진행중, 입고 완료)
	@Column(nullable = false, length = 50)
    private String ordstat;

	// 발주 등록일
    @Column(nullable = false)
	private Date ordcrdt;  

	// 발주 수정일
   	private Date ordupdt;

	// 발주 담당자
	@Column(nullable = false, length = 50)
    private String ordpic;

	// 비고
	@Column(length = 255)
    private String ordnote;
	
	// 공급처 ID (FK)
	@Column(nullable = false)
   	private int ordsupid;  

	// 자재 ID (FK)
	@Column(nullable = false)
	private int ormatid;  
	
}
