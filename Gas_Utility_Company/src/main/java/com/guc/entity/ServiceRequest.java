package com.guc.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ServiceRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	private String customerName;
	private String serviceType;
	private String details;
	private String attachment;
	private String status = "pending";
	private LocalDateTime createAt = LocalDateTime.now();
	private LocalDateTime updateAt = LocalDateTime.now();
}
