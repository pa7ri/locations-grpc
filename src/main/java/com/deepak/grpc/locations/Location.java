//$Id$
package com.deepak.grpc.locations;

public class Location {

	int id;
	String name;
	int longitude;
	int latitude;
	int active;
	
	public Location()
	{
		
	}
	
	public Location(String name, int longitude, int latitude, int active)
	{
		this.name= name;
		this.longitude= longitude;
		this.latitude= latitude;
		this.active= active;
	}
	
	public Location(int id, String name, int longitude, int latitude, int active)
	{
		this.id= id;
		this.name= name;
		this.longitude= longitude;
		this.latitude= latitude;
		this.active= active;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	
	public String toString()
	{
		String res= id + ", " + name + ", " + longitude + ", " + latitude + ", " + active;
		
		return res;
	}
	
	
}
