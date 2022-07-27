package oops_part_1.Inheritance.Vehicles.TwoWheelers.Types;

import oops_part_1.Inheritance.Vehicles.TwoWheelers.TwoWheeler;

public class Bike extends TwoWheeler{

	private String bikeName;
	private String bikeModel;
	
	public Bike(int wheels, String colour, String name, String price, String capacity, String twoWheelerName,
			String type, int speed, String bikeName, String bikeModel) {
		super(wheels, colour, name, price, capacity, twoWheelerName, type, speed);
		this.bikeName = bikeName;
		this.bikeModel = bikeModel;
	}

	public String getBikeName() {
		return "Bike Name: "+bikeName;
	}

	public String getBikeModel() {
		return "Bike Model: "+bikeModel;
	}
	
	
}
