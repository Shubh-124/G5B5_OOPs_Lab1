package com.glearning.itapp.service;

import com.glearning.itapp.model.Employee;
import java.util.Random;

public class CredentialServiceImp implements GenerateCredentials {
	
	
	@Override
	public String generateEmailAddress(String firstName, String lastName, String department,String company) {
		String email=firstName+lastName+"@"+department+"."+company+".com";
		
		return email;
	}
	
	private static final String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String lowerCase="abcdefghijklmnopqrstuvwxyz";
	private static final String Numbers="0123456789";
	private static final String splChars="!@#$%^&*()_";
	private static final String values=upperCase+lowerCase+Numbers+splChars;
	private static final Random rndm=new Random();
	
	@Override
	public String generateCredentials(int maxLength) {
		
		
			//use string builder
			StringBuilder passwordBuilder=new StringBuilder(maxLength);
			//at least one of each
			passwordBuilder.append(lowerCase.charAt(rndm.nextInt(lowerCase.length())));
			
			passwordBuilder.append(upperCase.charAt(rndm.nextInt(upperCase.length())));
			
			passwordBuilder.append(Numbers.charAt(rndm.nextInt(Numbers.length())));
			
			passwordBuilder.append(splChars.charAt(rndm.nextInt(splChars.length())));
			
//			fill-in the rest of passw with random chars
			for(int i=4;i<maxLength;i++) {
				passwordBuilder.append(values.charAt(rndm.nextInt(values.length())));
			}
			//shuffle the characters
			char[] passwordChars=passwordBuilder.toString().toCharArray();
			for(int i=0;i<passwordChars.length;i++)
			{
				int j=rndm.nextInt(passwordChars.length);
				char temp=passwordChars[j];
				passwordChars[i]=passwordChars[j];
				passwordChars[j]=temp;
				
			}
			return new String(passwordChars);
		

		
	}

	@Override
	public void displayCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows ");
		System.out.println("Email\t\t" + employee.getEmail());
		System.out.println("Password\t" + employee.getPassword());	
		
	}

}
