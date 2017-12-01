package edu.mum.hw3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue
	private int id;
	private String isbn;
	private String title;
	private String author;

	@ManyToOne
	@JoinColumn(name = "publisher_id")
	private Publisher publisher;

	protected Book() {

	}

	public Book(String isbn, String title, String author, Publisher publisher) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	public Publisher getPublisher() {
		return this.publisher;
	}

	public void addPublishers(Publisher p) {
		this.publisher = p;
	}

}
