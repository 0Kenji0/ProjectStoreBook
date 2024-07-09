package Bookstore.com.repository;

import Bookstore.com.domain.BookToCartItem;
import Bookstore.com.domain.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;



@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {
	
	void deleteByCartItem(CartItem cartItem);

}
