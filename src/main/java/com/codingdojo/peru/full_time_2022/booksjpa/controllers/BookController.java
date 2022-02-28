package com.codingdojo.peru.full_time_2022.booksjpa.controllers;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.peru.full_time_2022.booksjpa.models.Book;
import com.codingdojo.peru.full_time_2022.booksjpa.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books/{bookId}")
	public String index(@PathVariable("bookId") Long bookId, Model model) {
		
		/*
		 * System.out.println(bookId); Book book = bookService.findBook(bookId);
		 * System.out.println(book);
		 * 
		 * List<Book> books = bookService.allBooks();
		 * 
		 * model.addAttribute("book", book); model.addAttribute("books", books);
		 * 
		 * return "index.jsp";
		 */
		
		Book book = bookService.findBook(bookId);
		model.addAttribute("book", book);
		
		return "show.jsp";
	}
}
