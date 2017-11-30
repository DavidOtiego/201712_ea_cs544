package edu.mum.hw3.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private int id;
	private String studentId;
	private String firstname;
	private String lastname;

	@ManyToMany
	@JoinColumn(name = "course_id")
	@ElementCollection
	private List<Course> courses = new ArrayList<Course>();

	protected Student() {

	}

	public Student(String studentId, String fName, String lName) {
		this.studentId = studentId;
		this.firstname = fName;
		this.lastname = lName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<Course> getCourses() {
		return this.courses;
	}

	public void addCourse(Course c) {
		this.courses.add(c);
	}

}
