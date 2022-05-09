package com.abhisheksah.question5;

import javax.inject.Inject;

public class QuestionAnnotation {

private int studentId;
private String studentname;
private int studentclass;

@Inject
private Address address;

public QuestionAnnotation(int studentId, String studentname, int studentclass, Address address) {
	super();
	this.studentId = studentId;
	this.studentname = studentname;
	this.studentclass = studentclass;
	this.address = address;
}


public QuestionAnnotation() {
	super();
	// TODO Auto-generated constructor stub
}


public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentname() {
	return studentname;
}

public void setStudentname(String studentname) {
	this.studentname = studentname;
}

public int getStudentclass() {
	return studentclass;
}

public void setStudentclass(int studentclass) {
	this.studentclass = studentclass;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "QuestionAnnotation [studentId=" + studentId + ", studentname=" + studentname + ", studentclass="
			+ studentclass + ", address=" + address + "]";
}


}
