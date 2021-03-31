package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Vadapav {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Vadapav() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vadapav [price=" + price + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Staring Method....");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending Methods...");
	}
}
