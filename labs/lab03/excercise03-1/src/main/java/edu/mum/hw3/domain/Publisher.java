package edu.mum.hw3.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Publisher {
	
	@Id @GeneratedValue
	private int id;
	private String name;

	protected Publisher() {
		// TODO Auto-generated constructor stub
	}

}
