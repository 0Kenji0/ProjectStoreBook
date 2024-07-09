package Bookstore.com.repository;

import java.util.List;

import Bookstore.com.domain.CartItem;
import Bookstore.com.domain.Order;
import Bookstore.com.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;




public interface CartItemRepository extends CrudRepository<CartItem, Long>{
	
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	List<CartItem> findByOrder(Order order);
}
