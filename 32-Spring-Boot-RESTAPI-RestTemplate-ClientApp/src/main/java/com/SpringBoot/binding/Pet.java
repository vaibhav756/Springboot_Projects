package com.SpringBoot.binding;

public class Pet {
	
	private int id;
	private String type;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", type=" + type + ", price=" + price + "]";
	}
	
	

}
