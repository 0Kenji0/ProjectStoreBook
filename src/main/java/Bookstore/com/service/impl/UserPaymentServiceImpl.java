package Bookstore.com.service.impl;

import Bookstore.com.domain.UserPayment;
import Bookstore.com.repository.UserPaymentRepository;
import Bookstore.com.service.UserPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserPaymentServiceImpl implements UserPaymentService {

	@Autowired
	private UserPaymentRepository userPaymentRepository;
		
	public UserPayment findById(Long id) {
		return userPaymentRepository.findById(id).orElse(null);
	}
	
	public void deleteById(Long id) {
		userPaymentRepository.deleteById(id);
	}
} 
