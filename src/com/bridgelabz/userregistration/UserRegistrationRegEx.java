package com.bridgelabz.userregistration;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class UserRegistrationRegEx 
{

	public void firstNameValidator(String firstName) 
	{
		Pattern pattern=Pattern.compile("[A-Z]{1}[a-zA-Z]{2,}");
		Matcher matcher=pattern.matcher(firstName);
		if(matcher.matches())
			System.out.println("Entered FirstName "+firstName+" is VALID");
		else
			System.out.println("Entered FirstName "+firstName+" is INVALID");
	}
	
	public void lastNameValidator(String lastName) 
	{
		Pattern pattern=Pattern.compile("[A-Z]{1}[a-zA-Z]{2,}");
		Matcher matcher=pattern.matcher(lastName);
		if(matcher.matches())
			System.out.println("Entered LastName "+lastName+" is VALID");
		else
			System.out.println("Entered LastName "+lastName+" is INVALID");
	}

	public static void main(String[] args) 
	{
		System.out.println("**Welcome to User Registration Validation**");
		UserRegistrationRegEx userRegistration=new UserRegistrationRegEx();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter valid FirstName and LastName:");
		String firstName=scanner.next();
		String lastName=scanner.next();
		userRegistration.firstNameValidator(firstName);
		userRegistration.lastNameValidator(lastName);
			

	}

}

