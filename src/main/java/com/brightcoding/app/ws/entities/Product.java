package com.brightcoding.app.ws.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String productId;

  private String label;

  private String productImage ;

  private String description;

  private Double price;

  private int qteStock;

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Product() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getProductImage() {
    return productImage;
  }

  public void setProductImage(String productImage) {
    this.productImage = productImage;
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

}
