package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id // Primary key
	private String code;
	private String name;
	private String origin;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public Product() {
		
	}
	
	public Product(String code, String name, String origin) {
		this.code = code;
		this.name = name;
		this.origin = origin;
	}
	

}
