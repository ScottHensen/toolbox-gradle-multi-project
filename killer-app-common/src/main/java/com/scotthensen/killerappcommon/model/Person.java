package com.scotthensen.killerappcommon.model;

public class Person 
{
	private String firstName;
	private String lastName;
	private String middleName;

	
	public Person() {}
	
	public Person(String firstName, String lastName) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Override
	public String toString() {
		return "Person [" 
						+ "firstName="    + firstName 
						+ ", lastName="   + lastName  
						+ ", middleName=" + middleName
					+ "]";
	}


}
