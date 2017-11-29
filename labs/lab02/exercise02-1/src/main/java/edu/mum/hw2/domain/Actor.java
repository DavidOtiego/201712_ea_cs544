package edu.mum.hw2.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Actor {

	@Column(name="Actor_Character")
	private String character;
	private String name;
	private int rating;

	protected Actor() {

	}
	
	public Actor(String character, String name, int rating) {
		this.character = character;
		this.name = name;
		this.rating = rating;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
