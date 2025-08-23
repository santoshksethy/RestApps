package com.app.data;

public class Student
{
	
	private int sId;
	
	private String name;
	
	private String course;
	
	private double mark;

	public Student(int sId, String name, String course, double mark) {
		super();
		this.sId = sId;
		this.name = name;
		this.course = course;
		this.mark = mark;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
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

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	
	
	

}
