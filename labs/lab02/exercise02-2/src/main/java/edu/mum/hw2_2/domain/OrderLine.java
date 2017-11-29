package edu.mum.hw2_2.domain;

public class OrderLine {
	
	private int quantity;
	
	private Product product;

	protected OrderLine() {
		
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
