package Bookstore.com.service;


import Bookstore.com.domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(Long id);

	void deleteById(Long id);
}
