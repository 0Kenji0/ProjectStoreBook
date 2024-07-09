package Bookstore.com.repository;

import Bookstore.com.domain.security.Role;
import org.springframework.data.repository.CrudRepository;



public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
