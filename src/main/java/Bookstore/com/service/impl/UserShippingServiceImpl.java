package Bookstore.com.service.impl;

import Bookstore.com.domain.UserShipping;
import Bookstore.com.repository.UserShippingRepository;
import Bookstore.com.service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserShippingServiceImpl implements UserShippingService {
	
	@Autowired
	private UserShippingRepository userShippingRepository;
	
	
	public UserShipping findById(Long id) {
		return userShippingRepository.findById(id).orElse(null);
	}
	
	public void deleteById(Long id) {
		userShippingRepository.deleteById(id);
	}

}
