package com.greatlearning.service;

import com.greatlearning.domainmodel.Employee;

import java.util.Random;

public class CredentialsService implements ICredentialsService {

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String capitalLetters = "ABCDEFGHIJLMN";
		String smallCaseLetters = "abcdefghijlmnopqr";
		String numbers = "0123456789";
		String symbols = "@#$!&*";
		String values = capitalLetters + smallCaseLetters + numbers + symbols;

		StringBuffer strBuffer = new StringBuffer("");
		Random random = new Random();
		int randomCharacter = 0;
		for (int index = 0; index < 7; index++) {
			randomCharacter = random.nextInt(values.length());
			strBuffer.append(values.charAt(randomCharacter));

		}
		return strBuffer.toString();
	}

	@Override
	public String getEmailAddress(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		return firstName.trim() + lastName.trim() + "@" + department.toLowerCase() + ".abc.com";
	}

	@Override
	public void showCredentials(Employee employee, String email, String generatePassword) {
		// TODO Auto-generated method stub

		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email ->" + email);
		System.out.println("Password ->" + generatePassword);

	}

}
