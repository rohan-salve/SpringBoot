package com.ron.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ron.model.Book;

@RestController
@RequestMapping("/api/books")
public class BooksRestController {

	@GetMapping("/getBook/{isbn}")
	public ResponseEntity<Book> getBook(@PathVariable String isbn)
	{
		Book book = new Book(isbn,"Spring",800.5,"Johnson");
		
		Link link = WebMvcLinkBuilder.
					linkTo(WebMvcLinkBuilder.methodOn
							(BooksRestController.class).
								getAllBooks())
									.withRel("allBooks");
		book.add(link);				
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	
	
	@GetMapping("/allBooks")
	public List<Book> getAllBooks()
	{
		List<Book> bookList = new ArrayList<Book>();

		bookList.add(new Book("ISB-111","SPRING", 800.0,"RodJohnson"));
		bookList.add(new Book("ISB-222","HIBERNATE", 700.0,"GavinKing"));
		bookList.add(new Book("ISB-111","SERVLET", 800.0,"KeitySeirra"));
		return bookList;
	}
	
}
