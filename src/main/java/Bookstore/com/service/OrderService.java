package Bookstore.com.service;


import Bookstore.com.domain.*;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
					  ShippingAddress shippingAddress,
					  BillingAddress billingAddress,
					  Payment payment,
					  String shippingMethod,
					  User user);
	
	Order findById(Long id);
}
