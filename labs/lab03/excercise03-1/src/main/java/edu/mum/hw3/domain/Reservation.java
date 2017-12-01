package edu.mum.hw3.domain;

import java.util.Date;

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
	private Book book;

	protected Reservation() {

	}

	protected Reservation(Date date, Book book) {
		this.date = date;
		this.book = book;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Book getBook() {
		return this.book;
	}

	public void addBook(Book b) {
		this.book = b;
	}

}
