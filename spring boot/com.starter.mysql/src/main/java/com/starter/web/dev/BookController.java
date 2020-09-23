package com.starter.web.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
public class BookController {
	
	@Autowired
	BookRepo repo;
	
	
	@PostMapping("/savebook")
	public String run(@RequestBody List<Book> book) {
		repo.saveAll(book);
		return "hello";
	}

	
	@RequestMapping("/book")
	public String run() {
		return "book";
		
	}
	
	@GetMapping("/findall")
	public List<Book> find(){
		return (List<Book>) repo.findAll();
	}
	@GetMapping("/findbyid/{book_Id}")
	public Optional<Book> bookid(@PathVariable("book_Id") Long id){
		return repo.findById(id) ;
	}
	
//	@GetMapping("/findbyname/{book_name}")
//	public List<Book> bookname(@PathVariable("book_Name") String bookname){
//		return (List<Book>) repo.findbybook_Name(bookname) ;
//	}
}
