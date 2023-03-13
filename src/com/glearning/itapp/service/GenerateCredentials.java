package com.glearning.itapp.service;

import com.glearning.itapp.model.Employee;

public interface GenerateCredentials {

	 String generateEmailAddress(String firstName,String lastName,String department,String company);
	 String generateCredentials(int maxLength);
	 void displayCredentials(Employee employee);	
	
}
