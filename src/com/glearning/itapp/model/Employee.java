package com.glearning.itapp.model;

public class Employee {
private String firstName;
private String lastName;
private String email;
private String password;
private String department;
private String company;

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


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getDepartment() {
	return department;
}


public void setDepartment(String department) {
	this.department = department;
}


public String getCompany() {
	return company;
}


public void setCompany(String company) {
	this.company = company;
}


public Employee(String firstName,String lastName)
{
	this.firstName=firstName;
	this.lastName=lastName;
}
public Employee(String firstName,String lastName,String email)
{
	this.firstName=firstName;
	this.lastName=lastName;
	this.email=email;
}


@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password
			+ ", department=" + department + ", company=" + company + "]";
}



}
