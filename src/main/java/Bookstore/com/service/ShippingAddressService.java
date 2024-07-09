package Bookstore.com.service;

import Bookstore.com.domain.ShippingAddress;
import Bookstore.com.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
