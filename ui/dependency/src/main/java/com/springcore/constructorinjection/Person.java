package com.springcore.constructorinjection;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Certificate certificate;
	private List<String> list;
	
	public Person(String name, int id, Certificate certificate, List<String> list) {
		this.name = name;
		this.id = id;
		this.certificate = certificate;
		this.list = list;
	}

	@Override
	public String toString() {
		return this.name+ " : "+this.id+ " { "+this.certificate.name+" } " + this.list;
	}
}
