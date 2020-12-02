package org.com1027.question3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Flat extends Property{
	private int flatNumber = 0;
	private String street = null;
	private String city = null;
	private String postCode = null;
	private int numberOfRooms = 0;
	private Map<Room, ITenant> rooms = new HashMap<Room, ITenant>();
	private int availableRooms = numberOfRooms;
	private int occupiedRooms = 0;
	private int floor = 0;
	private Set<Room> roomKey = super.rooms.keySet();
	
	public Flat(int flatNumber, String street, String city, String postCode, int numberOfRooms, int floor)  {
		super(flatNumber, street, city, postCode, numberOfRooms);
		this.flatNumber = flatNumber;
		this.street = street;
		this.city = city;
		this.postCode = postCode;
		this.numberOfRooms = numberOfRooms;
		this.availableRooms = numberOfRooms;
		this.floor = floor;
		}
	public int getAvailableRooms() {
		return availableRooms;
	}
	public double getPrice() {
		double price = 0.00;
		for (Room r : roomKey){
			price = r.getPrice();
		}
		return price;
	}
	public void occupyRoom(Room room, ITenant tenant) {
		if (availableRooms > 0)  {
			super.rooms.put(room, tenant);
			this.availableRooms = availableRooms - 1;
			this.occupiedRooms = occupiedRooms + 1;
		}
	}
	public boolean isAvailable()  {
		if (availableRooms <=  0)  {
			return false;
		}  else  {
		return true;
		}
	}
	public String displayOccupiedProperties()  {
		String propertyText = "";
		propertyText = propertyText.concat(toString() + "\n");
		double totalPrice = 0.0;
		for (Room r : roomKey)  {
			propertyText = propertyText.concat("Room:  " + r.getPrice() + "\n");
			totalPrice = totalPrice + r.getPrice();
		}
		propertyText = propertyText.concat("Total: £" + ((totalPrice * 12) + 500));
		return propertyText;
	}
	
	@Override
	public String toString()  {
		return (super.toString() + " flat on " + floor + " floor :" + getAvailableRooms() + " available)") ;
	}
	
	private boolean validateCity(String city)  {
		return true;
	}
	private boolean validatePostCode(String postCode)  {
		return true;
	}
}
