package com.student;

import com.student.Entity.Order;
import com.student.Entity.PaymentDetails;
import com.student.Entity.ShippingDetails;
import com.student.Service.OrderService;
import com.student.Service.PaymentService;
import com.student.Service.ShippingDetailsService;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {

//	public static Pair<Order, ShippingDetails> getOrderInfo(int orderId){
//		Order order = OrderService.getOrderById(orderId);
//		ShippingDetails shippingDetails = ShippingDetailsService.getShippingDetails(orderId);
//		return Pair.of(order,shippingDetails);
//
//	}
//public static Pair<Order, ShippingDetails> getOrderInfoNew(int orderId){
//	Order order = OrderService.getOrderById(orderId);
//	ShippingDetails shippingDetails = ShippingDetailsService.getShippingDetails(orderId);
//	return MutablePair.of(order,shippingDetails);

//}
//public  static Triple<Order,ShippingDetails, PaymentDetails> getOrderFullInfo(int orderid){
//	Order order = OrderService.getOrderById(orderid);
//	ShippingDetails shippingDetails = ShippingDetailsService.getShippingDetails(orderid);
//	PaymentDetails paymentDetails = PaymentService.getPaymentDetails(orderid);
//
//	return Triple.of(order,shippingDetails,paymentDetails);
//
//}

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);

		//Pair<Order, ShippingDetails> orderInfo = getOrderInfo(123);
//		Pair<Order, ShippingDetails> orderInfoNew = getOrderInfoNew(123);
//orderInfoNew.setValue(new ShippingDetails());
//		System.out.println("OrderDetails :"+orderInfoNew.getLeft());
//		System.out.println("ShippingDetails :"+orderInfoNew.getRight());
//
//
//		Triple<Order, ShippingDetails, PaymentDetails> orderFullInfo = getOrderFullInfo(111);
//		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''");
//
//		System.out.println("OrderDetails :"+orderFullInfo.getLeft());
//		System.out.println("ShippingDetails :"+orderFullInfo.getMiddle());
//		System.out.println("paymentDetails :"+orderFullInfo.getRight());

	}

}
