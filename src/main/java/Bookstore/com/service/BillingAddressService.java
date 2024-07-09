package Bookstore.com.service;


import Bookstore.com.domain.BillingAddress;
import Bookstore.com.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
