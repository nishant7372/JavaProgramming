package oops_part_1.Inheritance.Vehicles.FourWheelers.Types;

import oops_part_1.Inheritance.Vehicles.FourWheelers.FourWheeler;

public class Truck extends FourWheeler{
	
	private String truckName;
	private String truckModel;
	
	public Truck(int wheels, String colour, String name, String price, String capacity, String fourWheelerName,
			String useType, String truckName, String truckModel) {
		super(wheels, colour, name, price, capacity, fourWheelerName, useType);
		this.truckName = truckName;
		this.truckModel = truckModel;
	}

	public String getTruckName() {
		return truckName;
	}

	public String getTruckModel() {
		return truckModel;
	}
	
	
}
