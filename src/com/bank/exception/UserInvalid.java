package com.bank.exception;

public class UserInvalid extends Exception {
	public UserInvalid() {

	}

	public String UsernameInvalid() {
		return ("No account exist.");
	}

	public String PasswordInvalid(String username) {
		return "Invalid credentials for username.";
	}

}
