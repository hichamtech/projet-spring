package com.brightcoding.app.ws.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "carts")
public class CartEntity {

	@Id
	@GeneratedValue
	private long id;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable( name = "CART_CART_PRODUCT", 
				joinColumns = @JoinColumn(name = "CART_ID"), 
				inverseJoinColumns = @JoinColumn(name = "CART_PRODUCT_ID"))
	private List<CartProductEntity> catsproducts;

	private Double totalPrice;

	public CartEntity() {
	}

	public CartEntity(long id, List<CartProductEntity> products, Double totalPrice) {
		this.id = id;
		this.catsproducts = products;
		this.totalPrice = totalPrice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<CartProductEntity> getProducts() {
		return catsproducts;
	}

	public void setProducts(List<CartProductEntity> products) {
		this.catsproducts = products;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof CartEntity)) return false;
		CartEntity that = (CartEntity) o;
		return getId() == that.getId() &&
				Objects.equals(getProducts(), that.getProducts()) &&
				Objects.equals(getTotalPrice(), that.getTotalPrice());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getProducts(), getTotalPrice());
	}

	@Override
	public String toString() {
		return "CartEntity{" +
				"id=" + id +
				", products=" + catsproducts +
				", totalPrice=" + totalPrice +
				'}';
	}
}
