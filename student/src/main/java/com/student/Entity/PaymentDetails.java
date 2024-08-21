package com.student.Entity;

public class PaymentDetails {
    private String paymentMethod ;
    private String transactionId;

    public PaymentDetails() {
    }

    public PaymentDetails(String paymentMethod, String transactionId) {
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "PaymentDetails{" +
                "paymentMethod='" + paymentMethod + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
