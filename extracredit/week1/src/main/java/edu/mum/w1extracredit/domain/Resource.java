package edu.mum.w1extracredit.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Resource {

	@Id
	@GeneratedValue
	private int id;

	@Basic(optional = false)
	private String name;

	@Enumerated(EnumType.STRING)
	private ResourceType resourceType;

	protected Resource() {

	}

	public Resource(String name, ResourceType rType) {
		this.name = name;
		this.resourceType = rType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}

}
