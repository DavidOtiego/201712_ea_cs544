package edu.mum.hw3.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int id;
	private String name;

	@OneToMany
	@JoinColumn(name = "reservation_id")
	private List<Reservation> reservations = new ArrayList<Reservation>();

	protected Customer() {

	}

	protected Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Reservation> getReservations() {
		return this.reservations;
	}

	public void addCourse(Reservation r) {
		this.reservations.add(r);
	}

}
