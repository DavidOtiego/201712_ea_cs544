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
public class Office {

	@Id @GeneratedValue
	private int id;
	private int roomnumber;
	private String building;

	@OneToMany
	@JoinColumn(name = "employee_id")
	@ElementCollection
	private List<Employee> employees = new ArrayList<Employee>();

	protected Office() {

	}

	public Office(int roomnumber, String building) {
		this.roomnumber = roomnumber;
		this.building = building;
	}

	public int getRoomNumber() {
		return roomnumber;
	}

	public void setRoomNumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void addEmployee(Employee e) {
		this.employees.add(e);
	}

}
