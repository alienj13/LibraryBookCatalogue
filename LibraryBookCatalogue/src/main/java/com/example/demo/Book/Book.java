package com.example.demo.Book;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private LocalDate publishedDate;
    private String genre;
    private int copiesAvailable;
    
    public Book(Long id,
    		    String title,
    		    String author,
    		    String isbn,
    		    LocalDate pd,
    		    String genre,
    		    int copiesavailable) {
    	
    	this.id = id;
    	this.title = title;
    	this.author = author;
    	this.isbn = isbn;
    	this.publishedDate = pd;
    	this.genre = genre;
    	this.copiesAvailable = copiesavailable;
    	
    }
    
    public Book() {

	
}
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getCopiesAvailable() {
		return copiesAvailable;
	}
	public void setCopiesAvailable(Integer copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}

    
}
