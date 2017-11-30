package edu.mum.hw3.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
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
	@JoinColumn(name="publisher_id")
	@ElementCollection
	private List<Publisher> publishers = new ArrayList<Publisher>();

	protected Book() {

	}

	public Book(String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
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

	public List<Publisher> getPublishers() {
		return this.publishers;
	}

	public void addPublishers(Publisher p) {
		this.publishers.add(p);
	}

}
