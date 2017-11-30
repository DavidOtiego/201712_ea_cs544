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
public class Course {

	@Id
	@GeneratedValue
	private int id;
	private String coursenumber;
	private String name;

	@ManyToMany
	@JoinColumn(name="student_id")
	@ElementCollection
	private List<Student> students = new ArrayList<Student>();

	protected Course() {
		
	}

	public String getCoursenumber() {
		return coursenumber;
	}

	public void setCoursenumber(String coursenumber) {
		this.coursenumber = coursenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void addStudent(Student s) {
		this.students.add(s);
	}

}
