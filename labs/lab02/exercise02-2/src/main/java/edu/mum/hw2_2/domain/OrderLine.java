package edu.mum.hw2_2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderLine {
	
	@Id @GeneratedValue
	private int id;
	private Double quantity;
	private Product product;

	protected OrderLine() {
		
	}
	
	public OrderLine(Double quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
