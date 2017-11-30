package edu.mum.hw3.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {

	@Id
	@GeneratedValue
	private int id;
	private Date date;

	@ManyToOne
	@JoinColumn(name = "book_id")
	@ElementCollection
	private List<Book> books = new ArrayList<Book>();

	protected Reservation() {

	}

	protected Reservation(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Book> getBooks() {
		return this.books;
	}

	public void addBook(Book b) {
		this.books.add(b);
	}

}
