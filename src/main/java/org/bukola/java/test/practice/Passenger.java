package org.bukola.java.test.practice;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passenger {

	private String identifier;
	private String name;
	private String countryCode;

    public Passenger(String identifier, String name, String countryCode) {
		this.identifier = identifier;
		this.name = name;
		this.countryCode = countryCode;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		String ssnRegex = "^(?!000|666|9\\d{2})[0-8]\\d{2}-(?!00)\\d{2}-(?!0000)\\d{4}$";
		if (!Pattern.compile(ssnRegex).matcher(identifier).matches()) {
			throw new RuntimeException("Invalid Identifier");
		}

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
		if (!Arrays.asList(Locale.getISOCountries()).contains(countryCode)) {
			throw new RuntimeException("Invalid country code");
		}
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
