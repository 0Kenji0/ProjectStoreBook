package Bookstore.com.repository;

import Bookstore.com.domain.Order;
import org.springframework.data.repository.CrudRepository;



public interface OrderRepository extends CrudRepository<Order, Long>{

}
