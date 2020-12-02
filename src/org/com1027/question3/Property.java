package org.com1027.question3;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class Property {
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
	protected double councilTax = 0.00;
	private TenantType type = null;
	public Property(int number, String street, String city, String postCode, int numberOfRooms)  {
		super();
		this.number = number;
		this.street = street;
		this.city = city;
		this.postCode = postCode;
		this.numberOfRooms = numberOfRooms;
		this.availableRooms = numberOfRooms;
	}
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
	//this method has a counter that increases with each professional, and giving the tax a new value depending on the circumstances
	public void setCouncilTax(double councilTax)  {
		int proCount = 0;
		Collection<ITenant> tenantKey = rooms.values();
		for (ITenant i: tenantKey)  {
			type = i.getType();
			if (type == TenantType.PROFESSIONAL)  {
				proCount = proCount + 1;
			}
		}
		if (proCount == 0)  {
			councilTax = 0.00;
		}  if (proCount == 1)  {
			councilTax = (councilTax * 3)/4;
		} 
	}
}
