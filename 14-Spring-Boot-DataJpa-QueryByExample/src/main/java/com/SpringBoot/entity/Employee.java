package com.SpringBoot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEES")
public class Employee {

	@Id
	@Column(name="EMPLOYEE_ID")
	private Integer empId;
	
	@Column(name="EMPLOYEE_NAME")
	private String empName;
	
	@Column(name="EMPLOYEE_AGE")
	private Integer empAge;
	
	@Column(name="EMPLOYEE_CITY")
	private String empCity;
	
	@Column(name="EMPLOYEE_ROLE")
	private String empRole;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empCity=" + empCity
				+ ", empRole=" + empRole + "]";
	}

	public Employee(Integer empId, String empName, Integer empAge, String empCity, String empRole) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empCity = empCity;
		this.empRole = empRole;
	}

	public Employee() {
		super();
	}
	
}
