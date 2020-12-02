package org.com1027.question1;

import java.util.StringTokenizer;
import java.util.regex.Pattern;


public class Agency {
	//definition of fields
	private String name = null;
	private String phoneNumber = null;
	// constructor(will throw exception in case of name mismatch)
	public Agency(String name, String phoneNumber)  throws IllegalArgumentException{
		super();
		this.name = name;
		if (Character.isLowerCase(name.charAt(0)))  {
			throw new IllegalArgumentException("Name starts lowercase");
		}  else  {
			StringTokenizer nameToken = new StringTokenizer(name);
			while  (nameToken.hasMoreTokens())  {
				if (Character.isLowerCase(name.charAt(0)))  {
					throw new IllegalArgumentException("Name start lowercase");
				}  else  {
					if (Pattern.matches("[ a-zA-z]+", name))  {
						System.out.println(nameToken);
						nameToken.nextToken();
					}  else  {
						throw new IllegalArgumentException("Character(s) not valid");
					}
				}
			}
		}
		this.phoneNumber = phoneNumber;
		if (phoneNumber.charAt(5) == (' ') && phoneNumber.length()  == 12)  {
		}  else  {
			throw new IllegalArgumentException();
		}
	}
	//getters for name and phoneNumber
	public String getName()  {
		return this.name;
	}
	public String getPhoneNumber()  {
		return this.phoneNumber;
	}
	
	@Override
	public String toString()  {
		return ("Agency: " + getName() + ", " + "Phone Number: " + getPhoneNumber());
	}	
}
