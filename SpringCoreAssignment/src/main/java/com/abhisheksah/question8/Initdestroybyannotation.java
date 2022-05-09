package com.abhisheksah.question8;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Initdestroybyannotation {

	private String name;
	private String course;
	private List <String> subject;
	
	
	public Initdestroybyannotation(String name, String course, List<String> subject) {
		super();
		this.name = name;
		this.course = course;
		this.subject = subject;
	}
	
	public Initdestroybyannotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Initdestroybyannotation [name=" + name + ", course=" + course + ", subject=" + subject + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("Hello "+getName());
		
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Thanks for detail  "+getName() +"  "+"good bye");
	}
}
