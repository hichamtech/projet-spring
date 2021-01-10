package com.brightcoding.app.ws.entities;

import javax.persistence.*;

@Entity
@Table(name = "cartsProducts")
public class CartProductEntity {

    @Id
    @GeneratedValue
    private long id ;
    private int quantity;

    @OneToOne
    private ProductEntity productEntity;

    public CartProductEntity() {}

    public CartProductEntity(long id, int quantity, ProductEntity productEntity) {
        this.id = id;
        this.quantity = quantity;
        this.productEntity = productEntity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }
}
