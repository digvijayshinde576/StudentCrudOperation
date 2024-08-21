package com.student.Entity;

public class Order {

   private int orderId;
    private String product;

    public Order() {
    }

    public Order(int orderId, String product, String quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    private String quantity;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", product='" + product + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
