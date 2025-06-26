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
@Table(name="CLIENT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDto {

	// 거래처 ID
	@Id	// 기본키 설정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cltid;
	
	// 거래처명
	@Column(nullable = false, length = 100)
	private String cltnm;
	
	// 연락처
	@Column(nullable = false, length = 20)
	private String clttel; 
	
	// 주소
	@Column(nullable = false, length = 255)
	private String cltaddr; 
	
	// 등록일
	@Column(nullable = false)
	private Date cltcrdt; 

}
 