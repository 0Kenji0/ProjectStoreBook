package Bookstore.com.service;


import Bookstore.com.domain.UserShipping;

public interface UserShippingService {
	UserShipping findById(Long id);
	
	void deleteById(Long id);
}
