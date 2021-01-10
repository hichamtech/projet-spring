package com.brightcoding.app.ws.responses;

import com.brightcoding.app.ws.entities.ProductEntity;

import javax.persistence.OneToOne;

public class CartProdcutResponse {

    private int quantity;
    private ProductEntity productEntity;

    public CartProdcutResponse() {
    }

    public CartProdcutResponse(int quantity, ProductEntity productEntity) {
        this.quantity = quantity;
        this.productEntity = productEntity;
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

    @Override
    public String toString() {
        return "CartProdcutResponse{" +
                "quantity=" + quantity +
                ", productEntity=" + productEntity +
                '}';
    }
}
