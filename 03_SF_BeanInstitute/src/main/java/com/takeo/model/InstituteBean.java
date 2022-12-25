package com.takeo.model;

import java.util.List;
import java.util.Set;

import lombok.Data;

@Data
public class InstituteBean {

	private String name;
	private List<String> facultyNames;
	private Set<String> courseNames;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<String> getFacultyNames() {
		return facultyNames;
	}


	public void setFacultyNames(List<String> facultyNames) {
		this.facultyNames = facultyNames;
	}


	public Set<String> getCourseNames() {
		return courseNames;
	}


	public void setCourseNames(Set<String> courseNames) {
		this.courseNames = courseNames;
	}


	public void display() {
		System.out.println("Faculty Name :");
		for (String name : facultyNames) {
			System.out.println(name);
		}
		System.out.println("Course Name :");
		for (String cname : courseNames) {
			System.out.println(cname);
		}
	}

}
