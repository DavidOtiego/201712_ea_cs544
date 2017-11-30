package edu.mum.hw3.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue
	private int id;
	private String name;

	@OneToMany
	@JoinColumn(name="employee_id")
	@ElementCollection
	private List<Employee> employees = new ArrayList<Employee>();

	protected Department() {

	}

	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void addEmployee(Employee e) {
		this.employees.add(e);
	}
}
