package com.example.demo.Book;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping
	public ResponseEntity<List<Book>> getAllBooks() {
		return ResponseEntity.ok(bookService.getAllBooks());
	}

	@GetMapping(params = "id")
	public ResponseEntity<Optional<Book>>  getBookById(@RequestParam Long id) {
		return ResponseEntity.ok(bookService.getBookById(id));
	}

	@GetMapping(params = "name")
	public ResponseEntity<Optional<Book>> getBookByName(@RequestParam String name) {
		return ResponseEntity.ok(bookService.getBookById(null));
	}

	@PostMapping
	public ResponseEntity<Book> createBook(@RequestBody Book book) {
		return ResponseEntity.ok(null);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
		return ResponseEntity.ok(null);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
		return ResponseEntity.noContent().build();
	}
}
