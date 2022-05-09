package com.abhisheksah.question8;

public class Initdestroy {

	private String name;
	private String  job;
	
	
	
	public Initdestroy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Initdestroy [name=" + name + ", job=" + job + "]";
	}
	
	public void createinit() {
		System.out.println("Hello "+getName());
		
	}
	public void destroycreation() {
		System.out.println("Thanks for detail  "+getName()+" "+" job:- "+getJob() +" " +"good bye");
	}
}
