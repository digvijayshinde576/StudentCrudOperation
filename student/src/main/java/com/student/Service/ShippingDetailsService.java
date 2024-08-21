package com.student.Service;

import com.student.Entity.ShippingDetails;

public class ShippingDetailsService {
    public  static ShippingDetails getShippingDetails(int orderId){
        return new ShippingDetails("Pune","1-1-1111","7878");

    }
}
