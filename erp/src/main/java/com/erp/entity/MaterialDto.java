package com.myerp.entity;

import java.time.LocalDateTime;
import java.util.Date;

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
	
		@Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matid_seq")
	    @SequenceGenerator(name = "matid_seq", sequenceName = "matid_seq", initialValue = 1000001, allocationSize = 1)
	    @Column(nullable = false)
	    private int matid;

	    @Column(nullable = false, length = 100)
	    private String matnm;

	    @Column(nullable = false, length = 100, unique = true)
	    private String matcd;

	    @Column(nullable = false, length = 50)
	    private String matun;

	    @Column(nullable = false)
	    private int matuprc;

	    @Column
	    private int matstq;

	    @CreatedDate
	    @Column(updatable = false)
	    private LocalDateTime matcrdt; // 등록일

	    @LastModifiedDate
	    private LocalDateTime matupdt; // 수정일

	    @Column(nullable = false, length = 100)
	    private String matcate;

	    @Column(length = 500)
	    private String matnote;
	


}
