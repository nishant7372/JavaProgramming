package oops_part_1.Inheritance.Vehicles.TwoWheelers;

import oops_part_1.Inheritance.Vehicles.Vehicle;

public class TwoWheeler extends Vehicle{
	private String twoWheelerName;
	private String type;
	private int speed;
	
	public TwoWheeler(int wheels, String colour, String name, String price, String capacity, String twoWheelerName,
			String type, int speed) {
		super(wheels, colour, name, price, capacity);
		this.twoWheelerName = twoWheelerName;
		this.type = type;
		this.speed = speed;
	}

	public String getTwoWheelerName() {
		return "Two Wheeler Name: "+twoWheelerName;
	}

	public String getType() {
		return "Use Type: "+type;
	}

	public String getSpeed() {
		return "Top Speed: "+speed + "kph";
	}
	
	
	
}
