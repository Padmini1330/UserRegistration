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
	
	public void emailValidator(String emailAddress) 
	{
		Pattern pattern=Pattern.compile("^[a-zA-Z]+[a-zA-Z0-9]*[_+-.]?[a-zA-Z0-9]+[@]{1}[a-zA-Z0-9]+[.]{1}[a-z]+[.]?[a-z]+$"); 
		Matcher matcher=pattern.matcher(emailAddress);
		if(matcher.matches())
			System.out.println("Entered emailAddressaddress "+emailAddress+" is VALID");
		else
			System.out.println("Entered emailAddressaddress "+emailAddress+" is INVALID");
	}

	public void phoneNumberValidator(String phoneNumber) 
	{
		Pattern pattern=Pattern.compile("^[0-9]{2}\\s{1}[0-9]{10}$"); 
		Matcher matcher=pattern.matcher(phoneNumber);
		if(matcher.matches())
			System.out.println("Entered phone number "+phoneNumber+" is VALID");
		else
			System.out.println("Entered phone number "+phoneNumber+" is INVALID");
	}


	public void passwordValidator(String password) 
	{
		Pattern pattern=Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#$%&?\"]).{8,}$"); 
		Matcher matcher=pattern.matcher(password);
		if(matcher.matches())
			System.out.println("Entered password "+password+" is VALID");
		else
			System.out.println("Entered password "+password+" is INVALID");
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("**Welcome to User Registration Validation**");
		UserRegistrationRegEx userRegistration=new UserRegistrationRegEx();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter valid FirstName and LastName:");
		String firstName=scanner.nextLine();
		String lastName=scanner.nextLine();
		System.out.println("Enter valid Email address:");
		String emailAddress=scanner.nextLine();
		System.out.println("Enter valid Phone Number:");
		String phoneNumber=scanner.nextLine();
		System.out.println("Enter valid Password:");
		String password=scanner.nextLine();
		userRegistration.firstNameValidator(firstName);
		userRegistration.lastNameValidator(lastName);
		userRegistration.emailValidator(emailAddress);
		userRegistration.phoneNumberValidator(phoneNumber);
		userRegistration.passwordValidator(password);
			
		System.out.println("Check for VALID emails");
		
		emailAddress= "abc@bridgelabz.co.in";
		userRegistration.emailValidator(emailAddress);
		
		emailAddress= "abc@gmail.com.com";
		userRegistration.emailValidator(emailAddress);
		
		emailAddress= "abc@yahoo.com";
		userRegistration.emailValidator(emailAddress);
		
		emailAddress= "abc@1.com";
		userRegistration.emailValidator(emailAddress);
		
		emailAddress= "abc-100@yahoo.com";
		userRegistration.emailValidator(emailAddress);
		
		emailAddress= "abc.100@yahoo.com";
		userRegistration.emailValidator(emailAddress);
		
		emailAddress= "abc111@abc.com";
		userRegistration.emailValidator(emailAddress);
		
		emailAddress= "abc-100@abc.net";
		userRegistration.emailValidator(emailAddress);
		
		emailAddress= "abc.100@abc.com.au";
		userRegistration.emailValidator(emailAddress);
		
		emailAddress= "abc+100@gmail.com";
		userRegistration.emailValidator(emailAddress);
		

		System.out.println("Check for INVALID emails");
		
		emailAddress= ".abc@abc.com";
		userRegistration.emailValidator(emailAddress);
		
		emailAddress= "abc";
		userRegistration.emailValidator(emailAddress);

		emailAddress= "abc@.com.my";
		userRegistration.emailValidator(emailAddress);

		emailAddress= "abc@abc@gmail.com";
		userRegistration.emailValidator(emailAddress);
		
		emailAddress= "abc()*@gmail.com";
		userRegistration.emailValidator(emailAddress);

		emailAddress= "abc..2002@gmail.com";
		userRegistration.emailValidator(emailAddress);

		emailAddress= "abc.@gmail.com";
		userRegistration.emailValidator(emailAddress);

		emailAddress= "abc123@.com";
		userRegistration.emailValidator(emailAddress);

		emailAddress= "abc123@.com.com";
		userRegistration.emailValidator(emailAddress);

		emailAddress= "abc123@gmail.a";
		userRegistration.emailValidator(emailAddress);

		emailAddress= "abc@%*.com";
		userRegistration.emailValidator(emailAddress);

		emailAddress= "abc@gmail.com.1a";
		userRegistration.emailValidator(emailAddress);

		emailAddress= "abc@gmail.com.aa.au";
		userRegistration.emailValidator(emailAddress);
	}


}

