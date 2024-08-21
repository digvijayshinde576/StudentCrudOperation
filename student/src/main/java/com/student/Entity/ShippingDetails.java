package com.student.Entity;

public class ShippingDetails {
    private String ShippingAddress;
    private String DeliveryDates;
    private String TrackingNo;

    public ShippingDetails() {
    }

    public ShippingDetails(String shippingAddress, String deliveryDates, String trackingNo) {
        ShippingAddress = shippingAddress;
        DeliveryDates = deliveryDates;
        TrackingNo = trackingNo;
    }

    public String getShippingAddress() {
        return ShippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        ShippingAddress = shippingAddress;
    }

    public String getDeliveryDates() {
        return DeliveryDates;
    }

    public void setDeliveryDates(String deliveryDates) {
        DeliveryDates = deliveryDates;
    }

    public String getTrackingNo() {
        return TrackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        TrackingNo = trackingNo;
    }

    @Override
    public String toString() {
        return "ShippingDetails{" +
                "ShippingAddress='" + ShippingAddress + '\'' +
                ", DeliveryDates='" + DeliveryDates + '\'' +
                ", TrackingNo='" + TrackingNo + '\'' +
                '}';
    }
}
