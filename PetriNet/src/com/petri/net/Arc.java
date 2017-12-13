package com.petri.net;

public class Arc {

	private Location location;
	private String direction;
	private Integer capacity;
	public Arc(Location location, String direction, Integer capacity) {
		super();
		this.location = location;
		this.direction = direction;
		this.capacity = capacity;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	public boolean isValid() {
		if (direction.equals("in")) {
			return true;
		}
		
		if (direction.equals("out") && capacity <= location.getTokens()) {
			return true;
		}
		
		return false;
	}
	
	public void update() {
		if (direction.equals("in")) {
			location.addTokens(capacity);
			return;
		}
		location.substractTokens(capacity);
	}
}
