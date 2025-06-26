package com.erp.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MATERIAL")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class) // ★ 중요!
public class MaterialDto {
	
	// 자재 ID
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matid_seq")
    @SequenceGenerator(name = "matid_seq", sequenceName = "matid_seq", initialValue = 1000001, allocationSize = 1)
    @Column(nullable = false)
    private int matid;

	// 자재명
    @Column(nullable = false, length = 100)
    private String matnm;

    // 자재코드
    @Column(nullable = false, length = 100, unique = true)
    private String matcd;

    // 자재 단위
    @Column(nullable = false, length = 50)
    private String matun;

    // 자재 단가
    @Column(nullable = false)
    private int matuprc;

    // 현재 재고 수량
    @Column(nullable = false)
    private int matstq;

    // 자재 등록일
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime matcrdt;

    // 자재 수정일
    @LastModifiedDate
    private LocalDateTime matupdt;

    // 자재 분류 (카테고리)
    @Column(nullable = false, length = 100)
    private String matcate;

    // 비고
    @Column(length = 500)
    private String matnote;



}
