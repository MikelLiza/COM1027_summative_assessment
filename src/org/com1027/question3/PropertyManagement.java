package org.com1027.question3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class PropertyManagement {
	private Agency estateAgency = null;
	private List<Property> properties = new ArrayList<Property>();
	
	public PropertyManagement(Agency estateAgency)  {
		super();
		this.estateAgency = estateAgency;
	}
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
	public String getEstateAgency()  {
		return estateAgency.toString();
	}
	public void addTenant(Property property, Room room1, Tenant tenant1) {
		property.occupyRoom(room1, tenant1);
	}	
	public double percentageCouncilTaxExemption() {
		double percent = 1.0;
		return percent * 100;
	}
	public String displayAllCouncilTaxExemptProperties()  {
		return "";
	}
}