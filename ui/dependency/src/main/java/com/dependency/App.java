package com.dependency;
import com.dependency.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext context = new ClassPathXmlApplicationContext("qwerty.xml");
    Student student = (Student) context.getBean("student1");
    System.out.println(student);
  }
}
