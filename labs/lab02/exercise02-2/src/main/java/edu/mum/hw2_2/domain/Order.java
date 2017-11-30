package edu.mum.hw2_2.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductOrder")
public class Order {

	@Id
	@GeneratedValue
	private int orderId;
	private Date date;

	@ElementCollection
	private List<OrderLine> orderLine = new ArrayList<OrderLine>();

	protected Order() {

	}
	
	public Order(Date date) {
		this.date = date;
	}

	public List<OrderLine> getOrderLine() {
		return this.orderLine;
	}

	public void addOrder(OrderLine order) {
		this.orderLine.add(order);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
