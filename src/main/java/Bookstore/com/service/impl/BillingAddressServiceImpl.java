package Bookstore.com.service.impl;

import Bookstore.com.domain.BillingAddress;
import Bookstore.com.domain.UserBilling;
import Bookstore.com.service.BillingAddressService;
import org.springframework.stereotype.Service;




@Service
public class BillingAddressServiceImpl implements BillingAddressService {
	
	public BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress) {
		
		billingAddress.setBillingAddressName(userBilling.getUserBillingName());
		billingAddress.setBillingAddressStreet1(userBilling.getUserBillingStreet1());
		billingAddress.setBillingAddressStreet2(userBilling.getUserBillingStreet2());
		billingAddress.setBillingAddressCity(userBilling.getUserBillingCity());
		billingAddress.setBillingAddressState(userBilling.getUserBillingState());
		billingAddress.setBillingAddressCountry(userBilling.getUserBillingCountry());
		billingAddress.setBillingAddressZipcode(userBilling.getUserBillingZipcode());
		
		return billingAddress;
	}

}
