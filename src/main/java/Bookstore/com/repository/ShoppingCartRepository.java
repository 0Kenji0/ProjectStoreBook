package Bookstore.com.repository;

import Bookstore.com.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;



public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
