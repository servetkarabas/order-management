package com.roche.order.web.model;

import com.roche.order.model.Product;

public class OrderLineRequest {
    private String productId;
    private Integer amount;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
