package edu.mum.hw3.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Department {

	@Id @GeneratedValue
	private int id;
	private String name;

	protected Department() {
		// TODO Auto-generated constructor stub
	}

}
