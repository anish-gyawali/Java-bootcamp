package com.takeo.model;

import java.util.List;

import lombok.Data;

@Data
public class College {
	
private String name;
private List<Student> students;

public void display() {
	System.out.println("student Name :");
	
	for (Student stu : students) {
		System.out.println(stu.getSno()+"\t"+stu.getSname()+"\t"+stu.getSadd());
	}
}
}
