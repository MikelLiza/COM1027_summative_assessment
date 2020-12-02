package org.com1027.question1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class PropertyManagement {
	private Agency estateAgency = null;
	//list called properties
	private List<House> properties = new ArrayList<House>();
	//constructor
	public PropertyManagement(Agency estateAgency)  {
		super();
		this.estateAgency = estateAgency;
	}
	//adds a house to the list
	public void addProperty(House house)  {
		this.properties.add(house);
	}
	//removes house from property, if there are currently no houses it will throw an exception
	public void removeProperty(House house)  {
		if (properties.size()>0)  {
		this.properties.remove(house);
		}  else  {
			throw new IllegalArgumentException();
		}
	}
	//returns the entire list as 
	public String displayProperties()  {
		String mix = "";
			if (properties.size()>0)  {
			mix = mix.concat(properties.toString().replace("[", "").replace("]", "") + "\n");
			}  else  {
				mix = mix.concat("");
			}
		mix = mix.replace("), ", ")\n");
		return mix;
	}
	//getter
	public String getEstateAgency()  {
		return estateAgency.toString();
	}
	//adds a tenant to a room of a house
	public void addTenant(House house1, Room room1, Tenant tenant1) {
		house1.occupyRoom(room1, tenant1);
		
	}
}
