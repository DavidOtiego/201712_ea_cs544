package edu.mum.hw3.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Student {

	@Id @GeneratedValue
	private int id;
	private String studentId;
	private String firstname;
	private String lastname;

	protected Student() {
		// TODO Auto-generated constructor stub
	}

}
