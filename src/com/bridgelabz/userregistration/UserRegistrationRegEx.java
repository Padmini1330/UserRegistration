package com.bridgelabz.userregistration;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class UserRegistrationRegEx 
{

	public static boolean firstNameValidator(String firstName) 
	{
		Pattern pattern=Pattern.compile("[A-Z]{1}[a-zA-Z]{2,}");
		Matcher matcher=pattern.matcher(firstName);
		return matcher.matches();
	}

	public static void main(String[] args) 
	{
		System.out.println("**Welcome to User Registration Validation**");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter valid FirstName:");
		String firstName=scanner.next();
		boolean isValid=firstNameValidator(firstName);
		if(isValid)
			System.out.println("Entered FirstName "+firstName+" is VALID");
		else
			System.out.println("Entered FirstName "+firstName+" is INVALID");

	}

}

