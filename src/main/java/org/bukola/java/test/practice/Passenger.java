package org.bukola.java.test.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passenger {

	private String identifier;
	private String name;
	private String countryCode;

    public Passenger(String identifier, String name, String countryCode) {
        String ssnRegex = "^(?!000|666) [0-8] [0-9]{2}-(?!00)[0-9]{2} -(?!0000) [0-9]{4}$";
        Pattern pattern = Pattern.compile(ssnRegex);
        Matcher matcher = pattern.matcher(identifier);
		if(!matcher.matches()) {
			throw new RuntimeException("Invalid Identifier");
		}
		this.identifier = identifier;
		this.name = name;
		this.countryCode = countryCode;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	@Override
	public String toString() {
		return "Passenger " + getName() + " with identifier: " + getIdentifier() + " from " + getCountryCode();
	}

	public void recordToSystem(){
		System.out.println(this + " has been recorded to the company system");
	}

}
