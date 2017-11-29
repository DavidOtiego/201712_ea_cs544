package edu.mum.hw3.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Customer {
	
	@Id @GeneratedValue
	private int id;
	private String name;

	protected Customer() {
		// TODO Auto-generated constructor stub
	}

}
