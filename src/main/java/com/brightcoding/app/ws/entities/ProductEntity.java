package com.brightcoding.app.ws.entities;

import org.hibernate.annotations.GenericGenerator;

import com.brightcoding.app.ws.shared.dto.CategoryDto;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "products")
public class ProductEntity implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 6027850451475384791L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
 
  private long id;

  private String code;

  private String label;

  private String description;

  private Double price;

  private int qteStock;
  
  private String productImage ;

  
  
  @ManyToOne()
  private CategoryEntity category;
  
  @ManyToOne()
  private BrandEntity brand;
  
  

public ProductEntity() {
	
}

public ProductEntity(long id, String code, String label, String description, Double price, int qteStock,
		CategoryEntity category, BrandEntity brand,String productImage) {
	super();
	this.id = id;
	this.code = code;
	this.label = label;
	this.description = description;
	this.price = price;
	this.qteStock = qteStock;
	this.category = category;
	this.brand = brand;
	this.productImage = productImage;
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

public String getLabel() {
	return label;
}

public void setLabel(String label) {
	this.label = label;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

public int getQteStock() {
	return qteStock;
}

public void setQteStock(int qteStock) {
	this.qteStock = qteStock;
}

public CategoryEntity getCategory() {
	return category;
}

public void setCategory(CategoryEntity category) {
	this.category = category;
}

public BrandEntity getBrand() {
	return brand;
}

public void setBrand(BrandEntity brand) {
	this.brand = brand;
}

public String getProductImage() {
	return productImage;
}

public void setProductImage(String productImage) {
	this.productImage = productImage;
}

@Override
public String toString() {
	return "ProductEntity [id=" + id + ", code=" + code + ", label=" + label + ", description=" + description
			+ ", price=" + price + ", qteStock=" + qteStock + ", category=" + category + ", brand=" + brand + "]";
}
  

 
}
