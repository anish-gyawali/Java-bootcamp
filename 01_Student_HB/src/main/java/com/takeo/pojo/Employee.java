package com.takeo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "EMP_TABLE")
public class Employee {

	@Id
	@Column(name = "ENO")
	private int eno;

	@Column(name = "ENAME")
	private String ename;

	@Column(name = "EADDRESS")
	private String eaddress;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

}
