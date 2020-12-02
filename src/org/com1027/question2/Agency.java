package org.com1027.question2;

import java.util.StringTokenizer;
import java.util.regex.Pattern;


public class Agency {
	//field initialisation
	private String name = null;
	private String phoneNumber = null;
	//constructor
	public Agency(String name, String phoneNumber)  throws IllegalArgumentException{
		super();
		this.name = name;
		//if name starts with a lower case exception
		if (Character.isLowerCase(name.charAt(0)))  {
			throw new IllegalArgumentException("Name starts lowercase");
		}  else  {
			//code to make sure every word of the name starts upper case and does not use invalid character
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
		//if there is no space after the 5 number it will throw an exception
		if (phoneNumber.charAt(5) == (' ') && phoneNumber.length()  == 12)  {
		}  else  {
			throw new IllegalArgumentException();
		}
	}
	//getters
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
