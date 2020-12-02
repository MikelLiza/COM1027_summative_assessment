package org.com1027.question2;

public class Tenant implements ITenant{
	//field declaration
	private String name = null;
	private String surname = null;
	private int age = 0;
	private TenantType type = null;
	//constructor
	public Tenant(String name, String surname, int age, TenantType type)  {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return (name + " " + surname);
	}
	//getter
	public int getAge()  {
		return this.age;
	}
	@Override
	public TenantType getType() {
		return this.type;
	}
}
