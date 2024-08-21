package com.student.Service;

import com.student.Entity.PaymentDetails;

public class PaymentService {
    public static PaymentDetails getPaymentDetails(int orderId){
        return new PaymentDetails("Online","ERt-56865873");

    }
}
