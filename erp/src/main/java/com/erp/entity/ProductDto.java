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
@Table(name="PRODUCT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {

	// 상품 ID
	@Id	// 기본키 설정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prdid;	

	// 상품명
	@Column(nullable = false, length = 100)
	private String prdnm;	

	// 상품코드
	@Column(nullable = false, unique = true)
	private String prdcd;

	// 상품 구분
	@Column(nullable = false, length = 100)
	private String prdtype;

	// 입고단가
	@Column(nullable = false)
	private int prduprcin;

	// 출고단가
	@Column(nullable = false)
	private int prduprcout;

	// 이미지
	@Column(nullable = false, length = 255)
	private String prdimg;

	// 비고
	@Column(length = 255)
	private String prdnote;

	// 등록일자
	private Date prdcrdt;

	// 수정일자
	private Date prdupdt;

	// 보유 수량
	@Column(nullable = false)
	private int prdqty;
}
