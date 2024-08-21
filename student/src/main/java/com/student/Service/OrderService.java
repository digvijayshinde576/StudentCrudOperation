package com.student.Service;

import com.student.Entity.Order;

public class OrderService {

    public  static Order getOrderById(int orderId){
        return new Order(1,"Mobile","5");
    }
}
