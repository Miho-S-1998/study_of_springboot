package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)　//キーを自動で作成
	private Long id;
	
	@NotBlank
	@Size(max=40)
	private String name;
	
	@ManyToOne　//多対一
	private Department department;
	

}
