package org.com1027.question1;

import java.util.HashMap;
import java.util.Map;

public class House {
	//definition of fields
	private int houseNumber = 0;
	private String street = null;
	private String city = null;
	private String postCode = null;
	private int numberOfRooms = 0;
	private Map<Room, ITenant> rooms = new HashMap<Room, ITenant>();
	private int availableRooms = numberOfRooms;
	private int occupiedRooms = 0;
	//constructor
	public House(int houseNumber, String street, String city, String postCode, int numberOfRooms)  {
		super();
		this.houseNumber = houseNumber;
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
		return (Room.getPrice() * this.numberOfRooms * this.occupiedRooms);
	}
	//this method maps a tenant to a room, decreasing the number of available rooms and increasing the number of occupied rooms
	public void occupyRoom(Room room, ITenant tenant) {
		if (availableRooms > 0)  {
			rooms.put(room, tenant);
			this.availableRooms = availableRooms - 1;
			this.occupiedRooms = occupiedRooms + 1;
		}
	}
	// method to check if a house has available rooms or not
	public boolean isAvailable()  {
		if (availableRooms <=  0)  {
			return false;
		}  else  {
		return true;
		}
	}
	
	
	@Override
	public String toString()  {
		return (houseNumber + " " + this.street + ", " + this.city + " " + this.postCode + " (" + this.numberOfRooms + " bedroom house :" + getAvailableRooms() + " available)");
	}
	//methods that will return true
	private boolean validateCity(String city)  {
		return true;
	}
	private boolean validatePostCode(String postCode)  {
		return true;
	}
	
}
