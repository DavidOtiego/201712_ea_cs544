package edu.mum.w1extracredit.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Entity
public class Project {

	@Id
	@GeneratedValue
	private Integer id;

	@Basic(optional = false)
	private String description;

	@Lob
	private byte[] descriptionHtml;

	@Basic(optional = false)
	@Embedded
	private Address address;

	@Basic(optional = false)
	@Temporal(TemporalType.DATE)
	private Date expectedStart;

	@Basic(optional = false)
	@Temporal(TemporalType.DATE)
	private Date expectedEnd;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Task> tasks = new ArrayList<>();

	@ElementCollection
	private List<String> beneficiaries = new ArrayList<>();

	protected Project() {

	}

	public Project(String description, Address address, Date start, Date end) {
		this.description = description;
		this.address = address;
		this.expectedStart = start;
		this.expectedEnd = end;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getDescriptionHtml() {
		return descriptionHtml;
	}

	public void setDescriptionHtml(byte[] descriptionHtml) {
		this.descriptionHtml = descriptionHtml;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getExpectedStart() {
		return expectedStart;
	}

	public void setExpectedStart(Date start) {
		this.expectedStart = start;
	}

	public Date getExpectedEnd() {
		return expectedEnd;
	}

	public void setExpectedEnd(Date end) {
		this.expectedEnd = end;
	}

	public void addTask(Task task) {
		this.tasks.add(task);
	}

	public void updateTask(Task task) {
		removeTask(task);
		this.tasks.add(task);
	}

	public void removeTask(Task task) {
		if (this.tasks.contains(task))
			this.tasks.remove(task);
	}

	public List<Task> getTasks() {
		return Collections.unmodifiableList(tasks);
	}

	public List<String> getBeneficiaries() {
		return Collections.unmodifiableList(this.beneficiaries);
	}

	public void addBeneficiary(String beneficiary) {
		this.beneficiaries.add(beneficiary);
	}

}
