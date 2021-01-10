package com.brightcoding.app.ws.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="brands")
public class BrandEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2161841127275668866L;
	
	@Id
	@GeneratedValue
	private long id;
	private String code;
	private String name;
	
	
	public BrandEntity() {
		
	}
	public BrandEntity(long id, String code, String name) {
	
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
		return "BrandEntity [id=" + id + ", code=" + code + ", name=" + name + "]";
	}

	
	
}
