package edu.mum.hw3.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Reservation {

	@Id @GeneratedValue
	private int id;
	private Date date;

	protected Reservation() {
		// TODO Auto-generated constructor stub
	}

}
