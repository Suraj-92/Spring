package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("standalone.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("+++++++++++++++++++");
		System.out.println(person.getFees());
		System.out.println("+++++++++++++++++++++++");
		System.out.println(person.getProperties());
	}
}
