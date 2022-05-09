package com.bridgelabz.main;

import java.time.LocalDate;

public class EmployeePayrollData {
	
int id;
String name;
String gender;
double salary;
LocalDate startDate;

public EmployeePayrollData(int id, String name, String gender, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.salary = salary;
}

public EmployeePayrollData(int id, String name, String gender, double salary, LocalDate startDate) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.salary = salary;
	this.startDate = startDate;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public LocalDate getStartDate() {
	return startDate;
}

public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
}

@Override
public String toString() {
	return "EmployeePayrollData [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary
			+ ", startDate=" + startDate + "]";
}

}