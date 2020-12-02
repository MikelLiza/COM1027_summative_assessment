package org.com1027.question2;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class Property {
	//field declaration
	private int number = 0;
	private String street = null;
	private String city = null;
	private String postCode = null;
	private int numberOfRooms = 0;
	protected Map<Room, ITenant> rooms = new HashMap<Room, ITenant>();
	private int availableRooms = numberOfRooms;
	private int occupiedRooms = 0;
	private double totalPrice = 0.0;
	private double price = 0.00;
	
	//constructor
	public Property(int number, String street, String city, String postCode, int numberOfRooms)  {
		super();
		this.number = number;
		this.street = street;
		this.city = city;
		this.postCode = postCode;
		this.numberOfRooms = numberOfRooms;
		this.availableRooms = numberOfRooms;
	}
	
	//getters
	public int getAvailableRooms() {
		return availableRooms;
	}
	public double getPrice() {
		Set<Room> roomKey = rooms.keySet();
		for (Room r : roomKey){
			price = r.getPrice();
		}
		return price;
	}
	
	//methods that child classes must have
	abstract void occupyRoom(Room room, ITenant tenant);
	abstract boolean isAvailable();
	abstract String displayOccupiedProperties();
	
	
	@Override
	public String toString()  {
		return (number + " " + street + ", " + city + " " + postCode + " (" + numberOfRooms + " bedroom" );
	}
	
	private boolean validateCity(String city)  {
		return true;
	}
	private boolean validatePostCode(String postCode)  {
		return true;
	}
}
