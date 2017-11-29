package edu.mum.hw2.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	private int id;

	@Embedded
	@ElementCollection
	private List<Actor> actors = new ArrayList<>();

	@ElementCollection
	private Set<String> categories = new HashSet<>();

	@ElementCollection
	private List<String> comments = new ArrayList<>();;

	private String cover;
	private String name;
	private int rating;

	protected Movie() {

	}

	public Movie(String name, String cover, int rating) {
		this.name = name;
		this.cover = cover;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
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

	public List<Actor> getActors() {
		return this.actors;
	}

	public void addActor(Actor actor) {
		this.actors.add(actor);
	}

	public Set<String> getCategories() {
		return categories;
	}

	public void addCategory(String category) {
		this.categories.add(category);
	}

	public List<String> getComments() {
		return comments;
	}

	public void addComment(String comments) {
		this.comments.add(comments);
	}

}
