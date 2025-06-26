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
@Table(name="MATERIAL")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MaterialDto {

	// 자재 ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matid;

	// 자재명
	@Column(nullable = false, length = 100)
	private String matnm;	
	
	// 자재코드
	@Column(nullable = false, unique = true, length = 50)
	private String matcd;  

	// 자재 단위
	@Column(length = 50)
	private String matun;

	// 자재 단가
	@Column(nullable = false)
	private int matuprc;  

	// 현재 재고 수량
	@Column(nullable = false)
	private int matstq; 

	// 자재 등록일
	private Date matcrdt;

	// 자재 분류 (카테고리)
	@Column(length = 100)
	private String matcate;

	// 비고
	@Column(length = 255)
	private String matnote;

}
