package com.app.data;

import java.util.List;


public class Student
{

	private Integer sId;
	
	private String firstName;
		
	private String lastName;
	
	private String email;
	
	private Long regdNo;
	
	private Integer totalMark;
	
	private List<String> subjects;

	public Student(Integer sId, String firstName, String lastName, String email, Long regdNo, Integer totalMark,
			List<String> subjects) {
		super();
		this.sId = sId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.regdNo = regdNo;
		this.totalMark = totalMark;
		this.subjects = subjects;
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getRegdNo() {
		return regdNo;
	}

	public void setRegdNo(Long regdNo) {
		this.regdNo = regdNo;
	}

	public Integer getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(Integer totalMark) {
		this.totalMark = totalMark;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	
	
}
