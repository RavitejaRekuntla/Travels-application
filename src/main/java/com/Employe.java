package com;

public class Employe {

	int pass;
	
	String email;

	public int getPassword() {
		return pass;
	}

	public void setPassword(int password) {
		this.pass = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employe [password=" + pass + ", email=" + email + "]";
	}
	
	
	
	
}
