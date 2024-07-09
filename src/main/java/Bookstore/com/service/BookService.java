package Bookstore.com.service;

import java.util.List;

import Bookstore.com.domain.Book;

public interface BookService {
	List<Book> findAll ();
	
	Book findById(Long id);
	
	List<Book> findByCategory(String category);
	
	List<Book> blurrySearch(String title);

}
