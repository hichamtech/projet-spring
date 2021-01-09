package com.brightcoding.app.ws.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class CategoryEntity {

	@Id
	@GeneratedValue
	private long id;
	
	private String code;
	private String name;
	
	
	
	public CategoryEntity() {
	
	}
	public CategoryEntity(long id, String code, String name) {
		
		this.id = id;
		this.code = code;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	@Override
	public String toString() {
		return "CategoryEntity [id=" + id + ", code=" + code + ", name=" + name + "]";
	}
	
	
}
