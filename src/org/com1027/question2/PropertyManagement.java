package org.com1027.question2;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PropertyManagement {
	//field declaration
	private Agency estateAgency = null;
	private List<Property> properties = new ArrayList<Property>();
	//constructor
	public PropertyManagement(Agency estateAgency)  {
		super();
		this.estateAgency = estateAgency;
	}
	//methods from q1
	public void addProperty(Property property)  {
		this.properties.add(property);
	}
	public void removeProperty(Property property)  {
		if (properties.size()>0)  {
		this.properties.remove(property);
		}  else  {
			throw new IllegalArgumentException();
		}
	}
	//now this method will also display the prices of the occupied properties and the total cost
	public String displayProperties()  {
		String mix = "";
		double totalPrice = 0;
		DecimalFormat df = new DecimalFormat("#.00");
			if (properties.size()>0)  {			
				mix = mix.concat(properties.toString().replace("[", "").replace("]", "") + "\n");
				for (Property p : properties)  {
					if (p.getPrice() > 0)  {
					mix = mix.concat("\tRoom:  " + p.getPrice() + "\n");
					totalPrice += p.getPrice();
					}
				}
				if (totalPrice > 0)  {
				totalPrice = totalPrice * 12;
				mix = mix.concat("\tTotal: £" + df.format(totalPrice));
				}
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
	//adds tenant to a room of a property
	public void addTenant(Property property, Room room1, Tenant tenant1) {
		property.occupyRoom(room1, tenant1);
	}	
}