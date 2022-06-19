package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.domainmodel.Employee;
import com.greatlearning.service.CredentialsService;

public class DriverClss {

	private static final CredentialsService credentialsService = new CredentialsService();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter your first and last name");
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		Employee employee = new Employee(firstName, lastName);
		String generatedEmail;
		String generatedPassword;

		System.out.println("Please enter the department from the following");
		System.out.println("1) Technical");
		System.out.println("2) HR");
		System.out.println("3) Admin");
		System.out.println("4) Legal");

		int departmetNumber = sc.nextInt();

		switch (departmetNumber) {
		case 1: {
			generatedPassword = credentialsService.generatePassword();
			generatedEmail = credentialsService.getEmailAddress(firstName, lastName, "Technical");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
		}
			break;
		case 2: {
			generatedPassword = credentialsService.generatePassword();
			generatedEmail = credentialsService.getEmailAddress(firstName, lastName, "HR");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
		}
			break;
		case 3: {
			generatedPassword = credentialsService.generatePassword();
			generatedEmail = credentialsService.getEmailAddress(firstName, lastName, "Admin");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
		}
			break;
		case 4: {
			generatedPassword = credentialsService.generatePassword();
			generatedEmail = credentialsService.getEmailAddress(firstName, lastName, "Legal");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
		}
			break;
		default:
			System.out.println("Please Enter a valid Department number");

		}

	}

}
