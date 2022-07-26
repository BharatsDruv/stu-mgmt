package com.bank.exception;

public class RegistrationAlreadyExist extends Exception {

	String username;

	public RegistrationAlreadyExist(String username) {

		this.username = username;
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

}
