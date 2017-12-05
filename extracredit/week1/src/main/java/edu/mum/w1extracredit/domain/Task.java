package edu.mum.w1extracredit.domain;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Entity
public class Task {

	@Id
	@GeneratedValue
	private Integer id;

	@Enumerated(EnumType.STRING)
	private TaskStatus status;

	@Basic(optional = false)
	@Temporal(TemporalType.DATE)
	private Date startOfTask;

	@Basic(optional = false)
	@Temporal(TemporalType.DATE)
	private Date endOfTask;

	@Basic(optional = false)
	private int requiredResources;

	@OneToMany
	@ElementCollection
	private List<Resource> resources = new ArrayList<>();

	protected Task() {

	}

	public Task(TaskStatus status, Date start, Date end) {
		this.status = status;
		this.startOfTask = start;
		this.endOfTask = end;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public Date getStartOfTask() {
		return startOfTask;
	}

	public void setStartOfTask(Date startOfTask) {
		this.startOfTask = startOfTask;
	}

	public Date getEndOfTask() {
		return endOfTask;
	}

	public void setEndOfTask(Date endOfTask) {
		this.endOfTask = endOfTask;
	}

	public int getRequiredResources() {
		return requiredResources;
	}

	public void setEndOfTask(int r) {
		this.requiredResources = r;
	}

	public void addResource(Resource r) {
		this.resources.add(r);
	}

	public void updateResource(Resource r) {
		removeResource(r);
		this.resources.add(r);
	}

	public void removeResource(Resource r) {
		if (this.resources.contains(r))
			this.resources.remove(r);
	}

	public List<Resource> getResourcess() {
		return Collections.unmodifiableList(this.resources);
	}
}
