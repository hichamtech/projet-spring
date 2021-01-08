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
  private Long id;

  private String code;

  private String label;

  private String description;

  private Double price;

  private int qteStock;

  public Product() {
  }

  public Product(String code, String label, String description, Double price, int qteStock) {
    this.code = code;
    this.label = label;
    this.description = description;
    this.price = price;
    this.qteStock = qteStock;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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

  @Override
  public String toString() {
    return "Product{" +
            "id=" + id +
            ", code='" + code + '\'' +
            ", label='" + label + '\'' +
            ", description='" + description + '\'' +
            ", price=" + price +
            ", qteStock=" + qteStock +
            '}';
  }
}
