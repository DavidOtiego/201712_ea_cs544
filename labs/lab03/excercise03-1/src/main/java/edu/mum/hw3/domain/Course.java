package edu.mum.hw3.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Course {

	@Id @GeneratedValue
	private int id;
	private String coursenumber;
	private String name;

	protected Course() {
		// TODO Auto-generated constructor stub
	}

}
