package Bookstore.com.service;


import Bookstore.com.domain.Payment;
import Bookstore.com.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment( UserPayment userPayment, Payment payment);
}
