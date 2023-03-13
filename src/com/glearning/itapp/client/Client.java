package com.glearning.itapp.client;
import java.util.Scanner;
import com.glearning.itapp.model.Employee;
import com.glearning.itapp.service.CredentialServiceImp;

public class Client {

	public static void main(String[] args) {
		Employee employee=new Employee("Shubh","Arora");
		employee.setCompany("TCS");
		CredentialServiceImp credentialService=new CredentialServiceImp();
		System.out.println("Please enter the department:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option) {
			case 1:
			{	String generatedEmail=credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),"tech", employee.getCompany().toLowerCase());
				String generatedpassword=credentialService.generateCredentials(8);
				employee.setEmail(generatedEmail);
				employee.setPassword(generatedpassword);
				credentialService.displayCredentials(employee);
			break;
			}
			case 2:
			{
				String generatedEmail=credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "admin", employee.getCompany().toLowerCase());
				String generatedpassword=credentialService.generateCredentials(8);
				employee.setEmail(generatedEmail);
				employee.setPassword(generatedpassword);
				credentialService.displayCredentials(employee);
				break;
			}
			case 3:
			{
				String generatedEmail=credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr", employee.getCompany().toLowerCase());
				String generatedpassword=credentialService.generateCredentials(8);
				employee.setEmail(generatedEmail);
				employee.setPassword(generatedpassword);
				credentialService.displayCredentials(employee);
				break;
			}
			case 4:
			{
				String generatedEmail=credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal", employee.getCompany().toLowerCase());
				String generatedpassword=credentialService.generateCredentials(8);
				employee.setEmail(generatedEmail);
				employee.setPassword(generatedpassword);
				credentialService.displayCredentials(employee);
				break;
			}
		default:{
			System.out.println("Enter a valid option");
		}
		
		}
			

	}

}
