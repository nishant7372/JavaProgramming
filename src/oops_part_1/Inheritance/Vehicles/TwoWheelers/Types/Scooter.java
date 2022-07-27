package oops_part_1.Inheritance.Vehicles.TwoWheelers.Types;

import oops_part_1.Inheritance.Vehicles.TwoWheelers.TwoWheeler;

public class Scooter extends TwoWheeler {

	private String scooterName;
	private String scooterModel;
	
	public Scooter(int wheels, String colour, String name, String price, String capacity, String twoWheelerName,
			String type, int speed, String scooterName, String scooterModel) {
		super(wheels, colour, name, price, capacity, twoWheelerName, type, speed);
		this.scooterName = scooterName;
		this.scooterModel = scooterModel;
	}

	public String getScooterName() {
		return scooterName;
	}

	public String getScooterModel() {
		return scooterModel;
	}

}
